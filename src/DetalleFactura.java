import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = scan.nextLine();

        double precio1 = 0, precio2 = 0;
        try{
            System.out.println("Ingrese precio 1: ");
            precio1 = scan.nextDouble();

            System.out.println("Ingrese precio 2: ");
            precio2 = scan.nextDouble();

        } catch (InputMismatchException e){
            System.out.println("Error. Debe ingresar un valor válido.");
            main(args);
            System.exit(0);
        }

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double total = totalBruto + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de "
            + String.valueOf(totalBruto) + ", con un impuesto de " + String.valueOf(impuesto)
            + " y el monto después de impuesto es de " + String.valueOf(total));

    }
}
