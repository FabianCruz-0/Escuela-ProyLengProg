print("Cantidado de filas en la matriz 1: ")
n = gets().to_i
print("cantidad de columnas en la matriz 1: ")
m = gets().to_i
print("cantidad de filas en la matriz 2: ")
x = gets().to_i
print("cantidad de columnas en la matriz 2: ")
y = gets().to_i
a = Array.new(n){Array.new(m)}
b = Array.new(x){Array.new(y)}
c = Array.new(n){Array.new(y)}
if(m==x)then
	for i in(0...n)
		for j in(0...m)
			print("Matriz 1: Ingresa un dato: ")
			a[i][j] = gets().to_i
		end
	end
	for i in(0...x)
		for j in(0...y)
			print("Matriz 2: Ingresa un dato: ")
			b[i][j] = gets().to_i
		end
	end
	letrero = ""
	for i in(0...n)
		for j in(0...y)
			c[i][j] = 0
			for u in(0...m)
				c[i][j] = (a[i][u] * b[u][j]) + c[i][j]
			end
			letrero = letrero + c[i][j].to_s + " "
		end
		letrero = letrero + "\n"
	end
	puts("La matriz resultante quedó: ")
	puts(letrero)
else
	puts("No se puede realizar la multiplicacion.\n
	Matrices con dimensiones no cumplidas.")
end