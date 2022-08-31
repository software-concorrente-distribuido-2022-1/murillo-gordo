from xmlrpc.server import SimpleXMLRPCServer

def credito(saldo):
    if saldo <= 200:
        percentual = 0
    if saldo > 200 and saldo <= 400:
        percentual = 20
    if saldo > 400 and saldo <= 600:
        percentual = 30
    if saldo > 600:
        percentual = 40
    print("Voce esta elegivel a R$" + str("${:,.2f}".format(saldo * (percentual/100))) + " de credito")
    return("Voce esta elegivel a R$" + str("${:,.2f}".format(saldo * (percentual/100))) + " de credito")
    
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(credito, 'credito')

server.serve_forever()
