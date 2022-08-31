import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Saldo: ")
saldo = float(input())

resposta = proxy.credito(saldo)

print(resposta)
