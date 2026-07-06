// write a program to generate first n prime numbers
public class Program_1
{
    public static void main(String[] args)
    {
        int n=5;
        int count=0, num=2;
        while (count < n)
        {
            boolean prime = true;
        for(int i=2; i<num; i++)
        {
            if (num % i == 0)
            {
                prime = false;
                break;
            }
        }
        if (prime) 
        {
            System.out.println(num + " ");
            count++;
        }
        num++;
        }
    }
}