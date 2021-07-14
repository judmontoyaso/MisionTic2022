import random

def machineSelection():
    randomNumber = random.randint(1,3)
    if randomNumber == 1:
        return "R"
    elif randomNumber == 2:
        return "P"
    elif randomNumber == 3:
        return "S"

machine = machineSelection()

user = input("Por favor ingrese su selección (R, P, S)")
        