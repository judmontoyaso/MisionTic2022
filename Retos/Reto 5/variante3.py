import csv
def solucion():
    date_lowest_mean = ""
    lowest_mean = ""
    date_highest_mean = ""
    highest_mean = ""
    fecha = []
    prom = []
    resultado = [["Fecha", "Concepto"]]

    with open('GOOG.csv',newline="") as GOOGCSV:
        reader = csv.reader(GOOGCSV,delimiter=",")
        for index,row in enumerate(reader):
            Fecha = row[0]
            if index != 0:

                precioCierre = float(row[4])
                high = float(row[2])
                low = float(row[3])
                prom.append((high + low) / 2)
                fecha.append(Fecha)
            

                if precioCierre < 1624:
                    resultado.append([Fecha,"MUY BAJO"])
                elif precioCierre >= 1624 and precioCierre < 1854:
                    resultado.append([Fecha, "BAJO"])
                elif precioCierre >= 1854 and precioCierre < 2084:
                    resultado.append([Fecha, "MEDIO"])
                elif precioCierre >= 2084 and precioCierre < 2314:
                    resultado.append([Fecha, "ALTO"])
                elif precioCierre >= 2314:
                    resultado.append([Fecha, "MUY ALTO"])

        minimo = min(prom)
        maximo = max(prom)
        posicionMinimo = prom.index(minimo)
        posicionMaximo = prom.index(maximo)
        
        date_lowest_mean = fecha[posicionMinimo]
        lowest_mean = float(minimo)
        date_highest_mean = fecha[posicionMaximo]
        highest_mean = float(maximo)
        
       
    with open('analisis_archivo.csv','w',newline="") as resultCSV:
        writer = csv.writer(resultCSV,delimiter="\t")
        for fila in resultado:
            writer.writerow(fila)

        
        return date_lowest_mean, lowest_mean, date_highest_mean, highest_mean
        
            

    
solucion()