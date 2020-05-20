print "numero de filas de sus matrices: "
entrada= gets()
fil=entrada.to_i
print "numero de columnas de sus matrices: "
entrada=gets()
col=entrada.to_i
mat1 = Array.new(fil){Array.new(col)}
mat2 = Array.new(fil){Array.new(col)}
for i in(0..(fil-1))
  for j in(0..(col-1))
  print "numero de la primera matriz: [#{i+1}][#{j+1}]"
    entrada=gets()
    mat1[i][j]=entrada.to_i
  end
end
for i in(0..(fil-1))
  for j in(0..(col-1))
  print "numero de la segunda matriz: [#{i+1}][#{j+1}]"
    entrada=gets()
    mat2[i][j]=entrada.to_i
  end
end
letrero=""
suma = Array.new(fil){Array.new(col)}
letrero=letrero+"la matriz A+B resulta: \n"
for i in(0..(fil-1))
  for j in(0..(col-1))
    suma[i][j]= mat1[i][j]+mat2[i][j]
    letrero= letrero+suma[i][j].to_s+" "
  end
  letrero=letrero+"\n"
end
print"#{letrero}"