import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num1=0;
        int num2=0;
        try { //Funciona para encapsular una parte de código que pueda presentar posibles errores para valorarlos.
            System.out.println("Enter the first number:");
            num1 = reader.nextInt();

            System.out.println("Enter the second number:");
            num2 = reader.nextInt();

            int result = num1 + num2;
            System.out.println("The result is " + result);
        } catch (Exception e) { //Lanza el error si el try posee uno
            System.out.println("values are not integers");
        } finally{ // Ejecuta el código sin importar si se cumple el try.
            System.out.print("The program is finish");
        }
    }
}