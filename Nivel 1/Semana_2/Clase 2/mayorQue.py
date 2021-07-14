#preguntar dos numero, calcular el mayor

numero1 = float(input(" Por favor ingrese un numero "))
numero2 = float(input(" Por favor ingrese otro numero "))

if numero1 > numero2:
    print(f"{numero1} es mayor que {numero2}")
elif numero1 == numero2:
    print(" Los numeros son iguales ")
else: print(f"{numero2} es mayor que {numero1}")