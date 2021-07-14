filaEjemplo = [100, -500, 400, -100, 35, 20, 89]

# primera manera de lograr una fila:
#Sacar valores de la ultima posicion y agregarlos en la posicion 0
# retirar un valor del final de la lista

datoRetirado = filaEjemplo.pop()
print(datoRetirado)
print(filaEjemplo)
filaEjemplo.insert(0,700)
print(filaEjemplo)


def retirarProximoValor(lista):
    lista.pop()
    return lista


def insertarSiguiente(lista, elemento):
    lista.insert(0, elemento)
    return lista

    
#segunda manera de lograr una fila, sacar valores de la ultima primera y agregarlos al fnial de la loista
#returar un valor del inicio de la lista

filaEjemplo2 = [40, -500, 800, 900, 1, -5, 8]
print(filaEjemplo2)
filaEjemplo2.pop(0)
print(filaEjemplo2)
filaEjemplo2.append(90)
print(filaEjemplo2)

def quitarSiguienteValor(lista):
    lista.pop(0)
    return lista

def agregarSiguienteValor(lista, elemento):
    lista.append(elemento)
    return lista