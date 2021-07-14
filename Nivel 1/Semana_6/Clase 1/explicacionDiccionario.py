#Diccionario

diccionario1 = {
    "elemento1" : 10,
    "elemento2" : -500,
    "nombre" : "Juan",
    "apellido" : "Montoya",
}

#acceder a los valores dentro del diccionario
print(diccionario1["nombre"])

print("Diccionario:", diccionario1)

print("Lista de keys:", diccionario1.keys())

for key in diccionario1.keys():
    print("key: ", key)
    print("value: ", diccionario1[key])

print(diccionario1.values())
for value in diccionario1.values():
    print(value)

diccionario1["Correo"] = "jd@ms.com"
print(diccionario1)
diccionario1["Correo2"] = "ms@ms.com"
print(diccionario1)
#crear una pareja de datos