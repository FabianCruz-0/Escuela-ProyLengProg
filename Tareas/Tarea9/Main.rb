puts "Convertir pesos MX a: "
puts "1.- Dolar"
puts "2.- Euro"
puts "3.- Yen Japones"
puts "4.- Dolar Hong Kong"
x=gets().to_i
case x
when 1
puts "pesos MX desea convertir:"
n=gets().to_i
r=n/20
puts "#{r} dolar(es)"
when 2
puts "pesos MX desea convertir:"
n=gets().to_i
r=n/23
puts "#{r} Euro(s)"
when 3
puts "pesos MX desea convertir:"
n=gets().to_i
r=n/0.18
puts "#{r} Yen japones"
when 4
puts "pesos MX desea convertir:"
n=gets().to_i
r=n/2.58
puts "#{r} Dolar de Hong Kong"
else 
puts "Opcion no valida"
end

