import java.util.Scanner;

public class TestJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro: ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Segundo: ");
        double num2 = sc.nextDouble();
        sc.nextLine();

        double resultado  = num1 * num2 ;
        System.out.println(num1+" x "+ num2+ "="+ resultado);

    }

}
