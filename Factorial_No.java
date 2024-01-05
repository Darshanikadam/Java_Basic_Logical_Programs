//logic --> [For example - 5!=120]

import java.util.*;
public class Factorial_No 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int i=1;
        int fact=1;

        while(i<=n)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of " + n + "is : " +fact);

        sc.close();
    }
}
