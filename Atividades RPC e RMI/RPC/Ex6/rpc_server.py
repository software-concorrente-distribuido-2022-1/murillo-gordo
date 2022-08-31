from xmlrpc.server import SimpleXMLRPCServer

def desconto(nome,nivel,salario,dependentes):
    if nivel == "A":
        if dependentes == 0:
            desconto = 3
        else:
            desconto = 8
    if nivel == "B":
        if dependentes == 0:
            desconto = 5
        else:
            desconto = 10
    if nivel == "C":
        if dependentes == 0:
            desconto = 8
        else:
            desconto = 15
    if nivel == "D":
        if dependentes == 0:
            desconto = 10
        else:
            desconto = 17
    
    salarioLiquido = salario - salario * (desconto/100)
    print("Nome: " + nome)
    print("Nivel: " + nivel)
    print("Salario liquido: " + str("${:,.2f}".format(salarioLiquido)))
    return("Nome: " + nome + "\nNivel: " + nivel + "\nSalario liquido: " + str("${:,.2f}".format(salarioLiquido)))
    
server = SimpleXMLRPCServer(("127.0.0.1", 4000))
print("Listening on port 4000...")
server.register_function(desconto, 'desconto')

server.serve_forever()
