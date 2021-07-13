import csv

#importar archivo csv

promedio = []
asia =[]
maximo = 0
minimo = 1000
resultados = [["Pais", "Generosity", "Healthy Life Expectancy"]]
cont = 0
with open("happiness.csv", newline="") as happinessCSV:
    happinessData = csv.reader(happinessCSV, delimiter =";")
    #imprimir columnas de archivo csv
    for index,row in enumerate(happinessData):
        

        

    # #imprimir informacion de colombia
    #     #if row[0] == "Colombia":
    #        # print(row)
    #  #imprimir informacion de latin america
        
    #     if row[1] == "Latin America and Caribbean":
    #         #print(row)
    #         #sacar promedio leading score de latin america
    #         promedio.append(float(row[2]))


    #     if "Asia" in row[1]:
    #         asia.append(row[7])

    #         #sacar maximos y minimos con contadores
    #         if float(row[7]) > maximo:
    #             maximo = float(row[7])
    #             paisMaxSuportAsia = row[0]
    #         elif float(row[7]) < minimo:
    #             minimo = float(row[7])
    #             paisMinSuportAsia = row[0]

    #  #sacar promedio leading score de latin america  
    # prom = (sum(promedio))/(len(promedio))

    # #Sacar maximos y minimos por lista
    # SocialSuportAltoAsia = max(asia)
    # SocialSuportbajoAsia = min(asia)
    
    # print(SocialSuportAltoAsia)
    # print(SocialSuportbajoAsia)

    # print(f"El pais es: ", paisMaxSuportAsia,  "Con un puntaje de :", maximo)
    # print(f"El pais es: ", paisMinSuportAsia,  "Con un puntaje de :", minimo)

