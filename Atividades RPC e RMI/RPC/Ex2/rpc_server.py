from xmlrpc.server import SimpleXMLRPCServer

def pessoa(nome,sexo,idade):

	if (sexo == "m" and idade>=18) or (sexo == "f" and idade >= 21):
		print(nome + ", voce atingiu a maioridade")
		return(nome + ", voce atingiu a maioridade")
	if sexo != "m" and sexo != "f":
		print("Sexo invalido.")
		return("Sexo invalido.")
	else:
		print(nome + ", voce ainda nao atingiu a maioridade")
		return(nome + ", voce ainda nao atingiu a maioridade")
	
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(pessoa, 'pessoa')

server.serve_forever()
