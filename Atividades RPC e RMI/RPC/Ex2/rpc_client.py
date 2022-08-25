import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Nome: ")
nome = (input())

print("Sexo (m ou f): ")
sexo = (input())

print("Idade: ")
idade = int(input())

resposta = proxy.pessoa(nome,sexo,idade)

print(resposta)
