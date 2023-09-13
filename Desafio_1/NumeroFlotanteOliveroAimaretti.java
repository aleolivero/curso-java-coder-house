import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número flotante: ");
        float numero = scanner.nextFloat();

        int parteEntera = (int) numero;
        float parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);

        scanner.close();



    }
}
