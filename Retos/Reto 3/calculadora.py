

def calculadora(bits1, bits2, OP):
    listaBits1 = []
    listaBits2 = []
    listaSalida = []
    for element in bits1:
        listaBits1.append(element)
       
    for element in bits2:
        listaBits2.append(element)
                
    if OP == "AND":
        for i, bits in enumerate(listaBits1):
            for j, bits3 in enumerate(listaBits2):
                if i == j:
                    if bits == "1" and bits3 == "1":
                        listaSalida.append("1")
                    else:
                        listaSalida.append("0")
    if OP == "OR":
        for i, bits in enumerate(listaBits1):
            for j, bits3 in enumerate(listaBits2):
                if i == j:
                    if bits == "0" and bits3 == "0":
                        listaSalida.append("0")
                    else:
                        listaSalida.append("1")   
    if OP == "OR":
        for i, bits in enumerate(listaBits1):
            for j, bits3 in enumerate(listaBits2):
                if i == j:
                    if bits ==  bits3:
                        listaSalida.append("0")
                    else:
                        listaSalida.append("1")                      

    resultado = ("".join(listaSalida))
    print(resultado)

calculadora("0110110110","1100011101","AND")