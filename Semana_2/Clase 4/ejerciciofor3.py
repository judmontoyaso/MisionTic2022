# Paso 1, pedirle asl usuario la cantidad de personas a ingresar.
# Paso 2: En un for de 0 a N pedir las edades de esas N personas
# Paso 3: guardar las edades de esas personas en una lista
# Paso 4: caluclar el promedio de esas edades

numberOfPersons = int(input(" Por favor ingrese la cantidad de personas: "))

listOfAges = []
for i in range(0, numberOfPersons):
    listOfAges.append(int(input(f"Por favor ingrese la edad de la persona {i}: ")))

print(listOfAges)