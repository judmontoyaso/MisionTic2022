# Piedra papel o tijera

contP1 = 0
contP2 = 0

while contP1 < 2 and contP2 < 2:

    Player1 = input(" Ingrese una R, P o S: ")
    Player2 = input(" Ingrese una R, P o S: ")

    if Player1 == Player2:
        print(" Empate ")
    elif Player1 == "R" and Player2 == "P":
        print(" El jugador 2 gana ")
        contP2 += 1
    elif Player2 == "R" and Player1 == "P":
        print(" El jugador 1 gana")
        contP1 += 1
    elif Player1 == "S" and Player2 == "P":
        print( "El jugador 1 gana")
        contP1 += 1
    elif Player2 == "S" and Player1 == "P":
        print( "El jugador 2 gana")
        contP2 += 1
    elif Player1 == "S" and Player2 == "R":
        print(" El jugador 1 gana")
        contP1 += 1
    elif Player2 == "S" and Player1 == "R":
        print( "El jugador 2 gana")
        contP2 += 1


