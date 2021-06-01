listofnumbres = [-10, 50, 800, 9, 6, 23.5]
cont = 0

for element in listofnumbres:
    cont = cont + 1
print("el total de elementos en la lista es ", cont)

suma = 0
for element in listofnumbres:
    suma = suma + element
print(" la suma de los elementos de la lista es ", suma)
print(" El promedio de los elementos de la lista es ", suma / cont)