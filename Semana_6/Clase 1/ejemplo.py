#hacer un diccionario en el que se relacione
#cada letra del alfabeto
#hacer una funcion para convertir cada palabra en numero



diccionario = {
    'A':1,
    'B':2,
    'C':3,
    'D':4,
    'E':5,
    'F':6,
    'G':7,
    'H':8,
    'I':9,
    'J':10,
    'K':11,
    'L':12,
    'M':13,
    'N':14,
    'Ñ':15,
    'O':16,
    'P':17,
    'Q':18,
    'R':19,
    'S':20,
    'T':21,
    'U':22,
    'V':23,
    'W':24,
    'X':25,
    'Y':26,
    'Z':27,

}

def convertirLetrasANumeros(texto):
    listaLetras = texto.split(" ")
    print(listaLetras)
    listaNumeros = []
    for letra in listaLetras:
        listaNumeros.append(diccionario[letra])
    return listaNumeros

resultado = convertirLetrasANumeros("J U A N")

print(resultado)
