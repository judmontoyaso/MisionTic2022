#pedir la calificacion del examen del usuario entre 0 y 5. 
# de 0 a 3 imprimir insucificiente, 
# en el rango de tres a cuatro imprimir aceptable, 
# en el rango de 4 a 4.5 imprimir sobresaliente, 
# entre 4.5 y 5 imprimir excelente. 
# en otro imprimir calificación invalida


calificacion = float(input(" Por favor ingrese su calificacion: "))

if 0 <= calificacion < 3:
    print(" Su calificación es insuficiente: ")
elif 3 <= calificacion < 4:
    print(" Su calificación es aceptable ")
elif 4 <= calificacion < 4.5:
    print("Su califiación es sobresaliente ")
elif 4.5 <= calificacion < 5:
    print(" Su calificación es Excelente ")
else: print(" Calificacion invalida ")