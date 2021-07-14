# atributos:
    # Nombre del producto
    # Precio del producto
    #referencia del producto REF#### #### = aleatorio de 1000 a 10000
    #inventario aleatorio entre 0 y 100

import random
class Product:
    def __init__(self, productName, productValue):
        self.productName = productName
        self.productValue = productValue
        self.REF = "REF" + str(random.randint(1000,10000))
        self.stock = random.randint(0,100)
