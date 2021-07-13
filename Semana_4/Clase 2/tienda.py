#1. Hacer una clase que se llama tienda
#2. atributos:
    #nombre
    #pagina web
    #direccion
    #lista de productos
#3. Crear un codigo por fuera de la función para inicializar la tienda.
    #pedirle al susuario el nombre de la tienda, la pagina web y la direccion
#4. En un archivo separado crear la case Product. (product.py)
    # atributos:
        # Nombre del producto
        # Precio del producto
        #referencia del producto REF#### #### = aleatorio de 1000 a 10000
        #inventario aleatorio entre 0 y 100
#5. Crear un metodo en la clase Store para agregar un nuevo producto
#6. Crear manualmente un producto y agregarlo a la lista de la tienda
#7. hacer un while true, pedirle al usuario un input para que el usuario ingrese el comando
    #"NP" que cree un nuevo producto en la tienda.
#8. Hacer un metodo en la clase tienda para imprimir el nombre y el inventario de cada uno de los productos
from product import Product
#1
class Store:
 #2
    def __init__(self,name,webPage,address):
        self.name = name
        self.web = webPage
        self.address = address
        self.productList = []
    #5
    def addProduct(self, newProduct):
        self.productList.append(newProduct)
    #8
    def nombreprint(self):
        for item in self.productList:
            print(" Producto:", item.productName)
            print(" Inventario:", item.stock)
            print(item.productValue)
            print("_____________")



#3
name = input(" Por favor ingrese el nombre de la tienda: ")
webPage = input(" Por favor ingrese la dirección web de la tienda: ")
address = input(" Por favor ingrese la dirección de la tienda: ")
store = Store(name, webPage, address)

#7NP

while True:
    operation = input( " Ingrese NP para crear un nuevo producto o I para imprimir la lista de productos guardados:")
    if operation == "NP":
        #6
        nombre = input(" Ingrese el nombre del nuevo producto: ")
        value = int(input(" Ingrese el valor del producto recien creado: "))
        productoCreado = Product(nombre, value)
        store.addProduct(productoCreado)
    elif operation == "I":
        store.nombreprint()


