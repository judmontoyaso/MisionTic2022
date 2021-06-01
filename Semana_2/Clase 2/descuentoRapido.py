#preguntar total de una compra
subTotal = float(input(" Ingrese por favor el valor de la compra" ))
if subTotal > 100000:
    total = subTotal - (subTotal*10/100)
else: total = subTotal
    
print(f" El total de la compra es {total}")

#si el valor es mayor a 100000 dar un descuento del 10%   