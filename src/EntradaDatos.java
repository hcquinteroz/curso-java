import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Número decimal = " + numeroDecimal);
        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b11110;
        System.out.println("Número binario = " + numeroBinario);

        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 036;
        System.out.println("Número octal = " + numeroOctal);

        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1e;
        System.out.println("Número Hexadecimal = " + numeroHex);

        String mensaje = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
