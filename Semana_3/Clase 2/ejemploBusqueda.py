import random
from typing import ForwardRef

print(random.randint(1,100))

#agregar 10 muneros aleatorios a una lista
lisOfRandomNumbers = []
n = int(input(" Por favor ingrese un numero: "))
for randomNumber in range(0,n):
    lisOfRandomNumbers.append(random.randint(1,100))

print(lisOfRandomNumbers)



