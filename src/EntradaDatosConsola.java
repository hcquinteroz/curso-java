import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosConsola {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;
        try{
            numeroDecimal = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error. Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Número decimal = " + numeroDecimal);
        String mensaje = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }
}
