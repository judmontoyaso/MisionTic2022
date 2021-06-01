
numeroAEncontrar = 7

numeroIngresadoUsuario = float(input("Adivina cual numero esta registrado como variable"))

if numeroIngresadoUsuario > numeroAEncontrar:
    print("El numero que estas buscando es menor al que ingresaste")
elif numeroIngresadoUsuario < numeroAEncontrar:
    print("El numero que estas buscando es mayor al que ingresaste")
elif numeroIngresadoUsuario == numeroAEncontrar:
    print("¡Correcto! El numero que ingresaste es el correcto")