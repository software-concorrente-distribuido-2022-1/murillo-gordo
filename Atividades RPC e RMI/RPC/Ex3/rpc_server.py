from xmlrpc.server import SimpleXMLRPCServer

def aluno(n1,n2,n3):

	media1 = (n1 + n2)/2
	media2 = (media1 + n3)/2	
	
	if (media1 >= 7) or (media1 >= 3 and media1 < 7 and media2 >= 5):
		print("Aluno aprovado.")
		return("Aluno aprovado.")
	else:
		print("Aluno reprovado.")
		return("Aluno reprovado.")
	
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(aluno, 'aluno')

server.serve_forever()
