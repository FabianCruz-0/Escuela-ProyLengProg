puts "Cantida de terminos: "
n = gets().to_i

pos = 1
seriePos = 2
serieNeg =-3
turnPos = true
contadorNums = 0

for i in (1..n)
  if(turnPos==true)then
    for y in (1..pos)
      if(contadorNums>=n)then
      abort("terminado")
      else
      print("#{seriePos}, ")
      seriePos=seriePos+2
      contadorNums=contadorNums+1
      end
    end
    turnPos=false
    pos=pos+1
  else
    for y in (1..3)
      if(contadorNums>=n)then
        abort("terminado")
      else
      print("#{serieNeg}, ")
      serieNeg=serieNeg-2
      contadorNums=contadorNums+1
      end
    end
    turnPos=true
  end

end