//[Perfect No --> Addition of divisor of given number is same as the given number
//For example- 28=1+2+4+7+14=28]

import java.util.*;
public class Perfect_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        
        int sum=0;
        int i=1;
        while(i <= n/2)
        {
            if(n%i == 0)
            {
                sum = sum+i;
            }
            i++;
        }
        if(sum == n)
        {
            System.out.println(n + " is Perfect Number");
        }
        else
        {
            System.out.println(n + " is not Perfect Number");
        }
        sc.close();
    }    
}
