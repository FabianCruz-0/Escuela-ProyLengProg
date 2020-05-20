puts "numero de terminos: "
x=gets().to_i
y=2
puts"\n"
contador=1
for i in(1..x)
  if(i%2==0)then
    for j in (1..y)
      if(contador>x)then
        abort("terminado")
      else
        print "#{i}, "
        contador=contador+1
      end
    end
    y=y+1

  else
    if(contador>x)then
      abort("terminado")
    else
  print "-#{i}, "
  contador=contador+1
    end
  end
end 