import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Idade: ")
idade = int(input())

resposta = proxy.faixaEtaria(idade)

print(resposta)
