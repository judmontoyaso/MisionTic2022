def actualizar_estado_editor(operaciones_usuario):
    #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    texto_escrito = []
    texto_actual = ""
    rehacer = []
    for i in range(len(operaciones_usuario)):
        print(operaciones_usuario[i])
        if operaciones_usuario[i] != "REHACER" and operaciones_usuario[i] != "DESHACER" and operaciones_usuario[i] != texto_actual:
            texto_escrito.append(texto_actual)
            texto_actual = operaciones_usuario[i]
            
        elif operaciones_usuario[i] == "DESHACER":
            rehacer.append(texto_actual)
            texto_actual = texto_escrito[-1]
            texto_escrito.pop()
            
            
        elif operaciones_usuario[i] == "REHACER":
            texto_escrito.append(texto_actual)
            texto_actual = rehacer[-1]
            rehacer.pop()
        
    texto_final = ("".join(texto_escrito))
    cadena_final = (texto_final + texto_actual)    
    print("cadena final:", cadena_final)

       

lista = ["Definamos qué es una función de Python: ","Una función es ","un arreglo unidimensional de datos", "DESHACER", "DESHACER", "REHACER", "un grupo de instrucciones"]
actualizar_estado_editor(lista)