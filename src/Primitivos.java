public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE + "\n");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE + "\n");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE + "\n");

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE + "\n");

        float realFloat = 2.12e3f; //2120f
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE + "\n");

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE + "\n");

        char caracter = '\u0040'; //'@'
        System.out.println("caracter = " + caracter);
        System.out.println("Tipo char corresponde en bytes a: " + Character.BYTES);
        System.out.println("Tipo char corresponde en bits a: " + Character.SIZE + "\n");
        System.out.println("Valor máximo de un char: " + Character.MIN_VALUE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE + "\n");

        boolean datologico = true;
        System.out.println("datoLogico = " + datologico);
    }
}
