//[Reverse of Number --> 123=321]

import java.util.*;
public class Reverse_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        
        int rev=0;
        int k;

        while(n>0)
        {
            k=n%10;
            rev=rev*10+k;
            n=n/10;
        }
        System.out.println("Reverse of the given Number is : "+rev);

        sc.close();
    }    
}
