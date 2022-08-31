from xmlrpc.server import SimpleXMLRPCServer

def carta(valor, naipe):
    
    pronome = "o"
    
    if valor == 1:
        valor = "As"
    if valor == 2:
        valor = "Dois"
    if valor == 3:
        valor = "Tres"
    if valor == 4:
        valor = "Quatro"
    if valor == 5:
        valor = "Cinco"
    if valor == 6:
        valor = "Seis"
    if valor == 7:
        valor = "Sete"
    if valor == 8:
        valor = "Oito"
    if valor == 9:
        valor = "Nove"
    if valor == 10:
        valor = "Dez"
    if valor == 11:
        valor = "Valete"
    if valor == 12:
        valor = "Rainha"
        pronome = "a"
    if valor == 13:
        valor = "Rei"

    if naipe == 1:
        naipe = "Ouros"
    if naipe == 2:
        naipe = "Paus"
    if naipe == 3:
        naipe = "Copas"
    if naipe == 4:
        naipe = "Espadas"

    print("Sua carta é " + pronome + " " + valor + " de " + naipe)
    return("Sua carta é " + pronome + " " + valor + " de " + naipe)

server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(carta, 'carta')

server.serve_forever()