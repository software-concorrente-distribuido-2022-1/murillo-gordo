from xmlrpc.server import SimpleXMLRPCServer

def funcionario(nome,cargo,salario):

	reajuste = 0

	if cargo == "operador":
		reajuste = 0.2
	if cargo == "programador":
		reajuste = 0.18
	
	salario += salario * reajuste
	
	print("Nome: " + nome + "\nSalario reajustado: " + str("${:,.2f}".format(salario)))
	
	return("Nome: " + nome + "\nSalario reajustado: " + str("${:,.2f}".format(salario)))
	
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(funcionario, 'funcionario')

server.serve_forever()
