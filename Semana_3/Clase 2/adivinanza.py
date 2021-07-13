# Hacer un juego de adivinanzas
# El numero a adiviar es un aleatorio
# entre 0 y 20
#el codigo debe generar automaticamente el aleatorio
#y preguntarle a l usuario con un input el numero que quiere adivinar
#el juego debe tener un numero maximo de intentos.
# si me paso del maximo sin adivinar, pierdo, si adibino gano


import random
number = random.randint(0,10)

user = False
intentos = 0
cont = 3 - intentos


print("")
print(f" Bienvenido, trate de averiguar el numero que estoy pensando, solo Tiene {cont} intentos")
print("")
x = int(input(" Por favor ingrese un número entre 0 y 10: "))
print("")



while number != x and intentos < 3:
    
    intentos = intentos + 1
    cont = 3 - intentos
    if cont != 0:
        print(f"Numero equivocado, solo le quedan {cont} intentos. ")
        print("")
    
    if intentos == 3:
        print(" No tiene más intentos ")
        print("")
    else:
        x = int(input(" Por favor ingrese otro número entre 0 y 10: "))
        print("")
    
if x == number:
    user = True
    print("Numero correcto")
    print("")


if user == True:
    print(" Felicidades, ha ganado. ")
    print("")
else:
    print("Lo siento, ha perdido. jajaja")
    print("")
