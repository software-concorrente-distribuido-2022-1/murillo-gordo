import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Idade: ")
idade = int(input())

print("Anos de servico: ")
servico = int(input())

resposta = proxy.aposentadoria(idade,servico)

print(resposta)
