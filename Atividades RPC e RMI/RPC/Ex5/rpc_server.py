from xmlrpc.server import SimpleXMLRPCServer

def faixaEtaria(idade):
    if idade <= 4:
        print("Você ainda é muito novo para natação.")
        return("Você ainda é muito novo para natação.")
    if idade >= 5 and idade <= 7:
        categoria = "Infantil A"
    if idade >= 8 and idade <= 10:
        categoria = "Infantil B"
    if idade >= 11 and idade <= 13:
        categoria = "Juvenil A"
    if idade >= 14 and idade <= 17:
        categoria = "Juvenil B"
    if idade >= 18:
        categoria = "Adulto"
     
    print("Sua categoria é: " + categoria)
    return("Sua categoria é: " + categoria)
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(faixaEtaria, 'faixaEtaria')

server.serve_forever()
