from xmlrpc.server import SimpleXMLRPCServer

def pesoIdeal(altura,sexo):

	if sexo == "m":
		pesoIdeal = (72.7 * altura) - 58
	if sexo == "f":
		pesoIdeal = (62.1 * altura) - 44.7
	print("Seu peso ideal é: " + str(pesoIdeal))
	return("Seu peso ideal é: " + str(pesoIdeal))
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(pesoIdeal, 'pesoIdeal')

server.serve_forever()
