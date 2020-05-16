import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
        int opcion;
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Presione 1 para: °C -> °F");
        System.out.println("Presione 2 para: °F -> °C");
        scan = new Scanner(System.in);
        opcion = Integer.parseInt(scan.nextLine());
        } while (opcion < 1 || opcion >2);
        //Validación de entrada de opción.

        if(opcion ==1) //Validación de opción a ejecutar.
        {
            System.out.print("Introducir los grados Celsius:");
            double gradCel = Double.parseDouble(scan.nextLine());
            double gradFar = (gradCel*1.8) + 32.0;
            System.out.println("La conversión es: °" + gradFar + "F." ); //Salida.
            } else {
            System.out.print("Introducir los grados Farenheit:");
            double gradFar = Double.parseDouble(scan.nextLine());
            double gradCel = (gradFar - 32.0) * 5/9;
            System.out.println("La conversión es: °" + gradCel + "C." ); //Salida.
            }
    }
}