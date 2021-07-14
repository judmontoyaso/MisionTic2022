matriz= [[1,2,3,4],
        [1,2,3,4],
        [1,2,3,4],
        [1,2,3,4] ]

n=4 # tamaño de la matriz
for i in range(n):
    for j in range(n):
        if i+j == n-1:
            print(matriz[i][j])
