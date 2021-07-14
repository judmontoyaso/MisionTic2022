#Elabore programa en Python que lea dos datos enteros correspondientes a los catetos de un triángulo
# rectángulo y que calcule e imprima el valor de la hipotenusa de dicho triángulo.

cateto1 =int(input(" Por favor ingrese el valor de un cateto: "))
cateto2 =int(input(" Por favor ingrese el valor del otro cateto: "))

hipotenusa = ((cateto1 ** 2) + (cateto1 ** 2)) ** (1/2)

print(hipotenusa)