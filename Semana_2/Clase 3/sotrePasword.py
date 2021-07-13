passwordStore = "12345"

contraseñaUsuario = input("ingrese contraseña: ")

cont = 0
max = 3

while passwordStore != contraseñaUsuario and cont > max:
    print(" Contraseña incorrecta")
cont =  cont + 1
contraseñaUsuario = input("ingrese contraseña: ")

if cont > max:
        print("bloqueado")
else:
        print(" ingreso exitoso")

