import java.util.Scanner;
public class MathematicalOperations {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Addition is = " + (num1 + num2));
        System.out.println("Subtraction is = " + (num1 - num2));
        System.out.println("Multiplication is = " + (num1 * num2));
        if (num2 != 0)
        {
            System.out.println("Division is = " + (num1 / num2));
        }
        else{
            System.out.println("Division not possible ");
        }
        sc.close();
    }
}
