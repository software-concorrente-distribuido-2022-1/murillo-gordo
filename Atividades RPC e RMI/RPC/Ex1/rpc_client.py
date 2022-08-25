import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://127.0.0.1:4000/")
    
print("Nome: ")
nome = (input())

print("Cargo: ")
cargo = (input())

print("Salário: ")
salario = float(input())

resposta = proxy.funcionario(nome,cargo,salario)

print(resposta)
