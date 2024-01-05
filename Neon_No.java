//[Neon Number --> the square of the number & addition of each digit of the square og the given number is same
// For example- 9 = (9*9=81) (8+1=9)]

import java.util.*;
public class Neon_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int k;
        int sum=0;
        int square = n*n;

        while (n>0) 
        {
            k=square%10;
            square=square/10;
            sum=sum+k;    
        }
        if(sum == n)
        {
            System.out.println(n + " is Neon Number");
        }
        else
        {
            System.out.println(n + " is not Neon Number");
        }
        sc.close();
    }    
}
