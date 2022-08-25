import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("n1: ")
n1 = float(input())

print("n2: ")
n2 = float(input())

print("n3: ")
n3 = float(input())

resposta = proxy.aluno(n1,n2,n3)

print(resposta)
