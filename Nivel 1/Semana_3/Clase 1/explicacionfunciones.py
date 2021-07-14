# imprimir suma resta y multiplicación de dos numeros enteros

def addtwonumbers(n1, n2):
    suma = n1 + n2
    return suma

def restanumbers(n1, n2):
    resta = n1 - n2
    return  resta


number1 = float(input(" Ingrese el primer numero: "))
number2 = float(input(" Ingrese el segundo numero: "))
operation = input(" ingrese la operación: ")

if operation == "S":
    suma = addtwonumbers(number1, number2)

print(" La suma es", suma)