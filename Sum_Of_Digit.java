//[sum of the digits --> addition of the digits of the given number
// For example- 123=1+2+3=6]

import java.util.*;
public class Sum_Of_Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        
        int k;
        int sum = 0;

        while(num>0)
        {
            k=num%10;
            sum=sum+k;
            num=num/10;
        }
        System.out.println("Sum of the digits of the given number is : "+sum);

        sc.close();
    }    
}
