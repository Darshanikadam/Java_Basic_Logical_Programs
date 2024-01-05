//[Spy Number --> Addition of each digit of the given number & multiplication of each digit of the given number is same
//For example- 1124= 1+1+2+4=8 & 1*1*2*4=8]

import java.util.*;
public class Spy_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int k;
        int sum=0;
        int mul=1;
        int temp=n;

        while(n>0)
        {
            k=n%10;
            n=n/10;
            sum=sum+k;
            mul=mul*k;
        }
        if(sum == mul)
        {
            System.out.println(temp + " is Spy Number");
        }
        else
        {
            System.out.println(temp + " is not Spy Number");
        }
        sc.close();
    }    
}
