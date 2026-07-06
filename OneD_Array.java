import java.util.Scanner;
public class OneD_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []a = new int [5];
        System.out.println("Enter five numbers: ");
        
        for(int i=0; i<5; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Array elements are: ");

        for(int i=0; i<5; i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
    
}
