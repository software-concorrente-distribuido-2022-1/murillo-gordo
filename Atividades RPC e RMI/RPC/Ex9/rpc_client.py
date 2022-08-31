import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Valor da carta: ")
valor = int(input())

print("Naipe da carta(1 - Ouros, 2 - Paus, 3 - Copas, 4 - Espadas): ")
naipe = int(input())

resposta = proxy.carta(valor,naipe)

print(resposta)