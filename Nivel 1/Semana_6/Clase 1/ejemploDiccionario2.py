#hacer un diccionario en el que se relacione
#cada numero con una alfabeto
#hacer una funcion para convertir cada numero en palabra



diccionario = {
    '1':'A',
    '2':'B',
    '3':'C',
    '4':'D',
    '5':'E',
    '6':'F',
    '7':'G',
    '8':'H',
    '9':'I',
    '10':'J',
    '11':'K',
    '12':'L',
    '13':'M',
    '14':'N',
    '15':'O',
    '16':'P',
    '17':'Q',
    '18':'R',
    '19':'S',
    '20':'T',
    '21':'U',
    '22':'V',
    '23':'W',
    '24':'X',
    '25':'Y',
    '26':'Z'
}


def convertirNumerosALetras(texto):
    listaNumeros = texto.split(" ")
    print(listaNumeros)
    listaLetras = []
    for numero in listaNumeros:
        listaLetras.append(diccionario[numero])
    return listaLetras

usuario = str(input("INGRESE EL NUMERO A CONVERTIR separado por espacios: "))
resultado = convertirNumerosALetras(usuario)

print(resultado)
        