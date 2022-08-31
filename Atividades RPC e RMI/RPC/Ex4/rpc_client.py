import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Altura: ")
altura = float(input())

print("Sexo(m/f): ")
sexo = input()

resposta = proxy.pesoIdeal(altura,sexo)

print(resposta)
