#Escriba un programa en Python que lea dos cargos, 
# luego usando esos cargos lea los nombres completos correspondientes y 
# por último imprima los nombres con sus respectivos cargos, cada uno en una línea.
#Ejemplo:
   # Entradas:
#Ingeniero
#Médica veterinaria
#Mateo Rivera
#Sofía Vanegas
#Salida:
#Mateo Rivera Ingeniero 
#Sofía Vanegas Médica veterinaria

cargo1 = input(" Por favor ingrese el cargo de la primer persona: ")
cargo2 = input(" Por favor ingrese el cargo de la segunda persona: ")

persona1 = input(" Por favor ingrese el nombre de la primera persona: ")
persona2 = input(f" Por favor ingrese el nombre de la segunda persona: ")

print(persona1, cargo1)
print(persona2, cargo2)