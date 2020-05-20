puts "Cantidad de numeros de la serie a mostrar: "
n=gets().to_i
p=1
for i in (1..n)
r=i**p
p=p+2
puts "#{r}"
end