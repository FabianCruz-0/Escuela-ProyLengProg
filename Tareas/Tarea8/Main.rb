puts("Eliga la conversion que desea realizar")
puts("1.- Celsius -> Farenheit")
puts("2.- Farenheit -> celsius")
x=gets().to_i
case x
when 1
puts "Temperatura a convertir: "
n=gets().to_i
r=((n*1.8)+32)
puts "Grados farenheit: #{r}"
when 2
puts "Temperatura a convertir:"
n=gets().to_i
r=((n-32)/1.8)
puts "Grados farenheit: #{r}"
else 
puts "Registrar un numero válido"
end