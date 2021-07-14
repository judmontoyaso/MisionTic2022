#Crear una clase tienda con los siguientes atributos:
#nombre
#direccion
#Telefono
#lista de productos
#lista de clientes
#historico de ventas

#crear una clase producto que tenga los siguientes atributos
#nombre
#precio

#crear una clase cliente que tenga los siguientes atributos
#nombre
#documento
#lista de compras

#Crear una clase venta que tenga los siguientes atributis
#fecha
#lista de productos y cantidades
#cliente

class Tienda:
    def __init__(self, nombre, direccion, telefono):
        self.nombre = nombre
        self.direccion = direccion
        self.telefono = telefono
        self.listaProductos = []
        self.listaClientes = []
        self.historicoVentas = []
    #definir un metodo para agregar un nuevo producto

    def agregarProducto(self, producto):
        self.listaProductos.append(producto)

    def imprimirProducto(self):
        for producto in self.listaProductos:
            print(producto)

        
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return self.nombre + " - " + str(self.precio)

class Cliente:
    def __init__(self,nombre, documento):
        self.nombre = nombre
        self.documento = documento
        self.listaCompras = []

class Venta:
    def __init__(self, fecha, cliente):
        self.fecha = fecha
        self.cliente = cliente
        self.productos = {}


#Crear la logica de la aplicacion

tienda = Tienda("CONUCO", "calle 123", "555")

while True:

    instrucciones="""
        ingrese P para agregar un nuevo producto a la tienda
        ingrese IP para imprimir los productos de la tienda
    """
    
    operacion = input(instrucciones)
    
    if operacion == "P":
        nombreProducto=input("ingrese el nombre del producto: ")
        precioProducto=float(input("Ingrese el precio del producto: "))
        nuevoProducto = Producto(nombreProducto,precioProducto)
        tienda.agregarProducto(nuevoProducto)
    elif operacion == "IP":
        tienda.imprimirProducto()