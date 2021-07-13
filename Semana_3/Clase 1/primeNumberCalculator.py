# Calcular si un numero es primo o no

def isPrimeNumber(number):
    isprime = True
    for divisor in range(2, number):
        if number % divisor == 0:
            isprime = False
        return isprime
    return isprime


contPrimeNumbers = 0
numberToEvaluate = 1
n = int(input(" Ingrese un numero: "))
SumaPrime = 0
while contPrimeNumbers < n:
    
    if isPrimeNumber(numberToEvaluate):
        contPrimeNumbers = contPrimeNumbers + 1
        SumaPrime = SumaPrime + numberToEvaluate
        if isPrimeNumber(SumaPrime):
            print(" La suma de los numeros es un numero primo")
            print(SumaPrime)
    numberToEvaluate = numberToEvaluate + 1

