from xmlrpc.server import SimpleXMLRPCServer

def aposentadoria(idade,servico):
    if idade >= 65 or servico >= 30 or (idade >= 60 and servico >= 25):
        print("Voce ja pode se aposentar.")
        return("Voce ja pode se aposentar.")
    else:
        print("Voce ainda nao pode se aposentar.")
        return("Voce ainda nao pode se aposentar.")
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(aposentadoria, 'aposentadoria')

server.serve_forever()
