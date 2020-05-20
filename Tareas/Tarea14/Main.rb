puts "cantidad de filas:"
n=gets().to_i
puts "cantidad de columnas:"
m=gets().to_i
a=Array.new(n){Array.new(m)}
for i in (0...n)
for j in (0...m)
puts "numero: \n"
a[i][j]=gets.to_i
end
end
for i in (0...n)
for j in (0...n)
print "#{a[i][j]}   "
end
puts "\n"
end
puts "numero a buscar: "
x=gets.to_i
z=0
for i in (0...n)
for j in (0...n)
if(a[i][j]==x)
z=z+1
end
end
end
puts "\nEl numero a buscar es el: #{x} \nVeces que aparece en el vector: #{z}"