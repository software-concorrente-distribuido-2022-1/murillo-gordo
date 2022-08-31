import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Nome: ")
nome = input()

print("Nivel(A/B/C/D): ")
nivel = input()

print("Salario: ")
salario = float(input())

print("Numero de dependentes: ")
dependentes = int(input())

resposta = proxy.desconto(nome,nivel,salario,dependentes)

print(resposta)
