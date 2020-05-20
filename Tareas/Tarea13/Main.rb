puts "tamaño del vector: "
n=gets().to_i
a=Array.new(n)
for i in (0...n)
    puts "numero: "
	a[i] = gets().to_i
	end	
	print("[ ")
for i in(0...(n-1))
	print("#{a[i]}, ")
end
print("#{a[i+1]} ]")
print("numero a buscar: ")
x = gets().to_i
j=0
for i in(0...n)
	if(a[i]==x)then
		j=j+1
	end
end 
puts("\n\nEl numero a buscar es: #{x} \nVeces que aparece en el vector: #{j}")