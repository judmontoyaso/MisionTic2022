lista = [1, 5, 2345,213, -12, 234, 2]

print(lista)
print(lista[2])

x = lista[1] + lista[0]
print(x)

#agrega un elemento al final de la lista
lista.append(x)
print (lista)

#insertar un elemento en una posicion determinado
lista.insert(0, 200)
print(lista)

#Eliminar un valor segun posición, si esta vacio elimina el ultimo
lista.pop()

#organizar una lista
lista.sort()

#eliminar un valor especifico, el primero de izquierda a derecha
lista.remove()

#longitud de una lista
len(lista)

#slicing, muestra posiciones de n a y-1

lista[n:y-1]