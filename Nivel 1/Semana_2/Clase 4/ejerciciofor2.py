listofnumbers=[ 
    1,
    2.4,
    4.5,
    2.4,
    4.3,
    3.8,
    3.1,
    3.7,
    4.5,
    5,
    2.1,
    1.8,
    2.4,
    4.3,
]

contInsuficiente = 0
contAceptable = 0
contSobresaliente = 0
sumaInsuuficiente = 0
sumaSobresaliente = 0
sumaAceptable = 0

for grade in listofnumbers:
    if grade < 3:
        contInsuficiente = contInsuficiente + 1
        sumaInsuuficiente = sumaInsuuficiente + grade
    elif grade >= 3 and grade < 4:
        contAceptable = contAceptable + 1
        sumaAceptable = sumaAceptable + grade
    else:
        contSobresaliente = contSobresaliente + 1
        sumaSobresaliente = sumaSobresaliente + grade

print(" La cantidad de insuficientes es", contInsuficiente)
print(" La cantidad de aceptables es", contAceptable)
print(" La cantidad de sobresalientes es", contSobresaliente)


