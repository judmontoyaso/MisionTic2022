#precio base de los huevos = 18000

#precio de base de las arepas = 5000

#si alguien compra mas de 10 canastas, el precio es 1000

#si alguien compra mas de 10 canastas y compra 10 paquetes de arepas el precio de los huevos es 1000 y el de las arepas 2000

#paso 1: preguntar cuantos huevos quiere comprar la persona
cantidadHuevos = int(input("digite la cantidad de canastas de huevo que quiere comprar"))

#paso 2: preguntar cuantas arepas quiere comprar la persona
quiereArepas = input("usted quiere llevar arepas?").lower()


CantidadArepas = 0
if quiereArepas == "si":
    CantidadArepas = float(input("¿cuantas arepas quiere llevar"))

#paso 3: calcular el total de la compra

precioHuevos = 1800
precioArepas = 5000

if cantidadHuevos > 10:
    precioHuevos = 1000

if CantidadArepas > 10 and cantidadHuevos > 10:
    precioHuevos = 800
    precioArepas = 2000


totalCompra = precioHuevos * cantidadHuevos + precioArepas * CantidadArepas
print(f"el valor de su compra es de ${totalCompra} pesos")

#Que pasa si quiere poner un descuento al total de compra, si el total es de 50000 dar un descuento adicional del 10%. si además estan comprando huevos y arepas el descuento es del 15%. Mostrarle al usuario el total de la compra y el descuento