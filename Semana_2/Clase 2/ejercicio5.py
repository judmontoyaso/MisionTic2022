#mostrar si un estudiante esta habilitado para presentar un examen

#si el examen fue a mas del 75% puede presentar el examen
#si fue a menos del 75% puede presentar el examen con excusa medica

numeroDeClases = int(input("ingrese el número de clases durante el periodo academico: "))
numeroDePersona = int(input("ingrese el número de clases a las que asistio durante el periodo academico: "))


tope = numeroDeClases * 75/100

if numeroDePersona >= tope:
    print(" Puede presentar el examen ")
if numeroDePersona < tope: 
    excusa = input("Tiene excusa medica?: ").lower()
    if excusa == "si":
        print(" puede presentar el examen ")
    else:  
        print(" No puede presentar el examen ")
