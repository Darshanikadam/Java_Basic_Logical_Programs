//[Krishnamurthy Number --> check the adiition of factorial of each digit present in number given by user is same as given number]

import java.util.*;
public class Krishnamurthy_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int k;
        int fact=0;
        int temp = n;
        int sum=0;
        int i;

        while (n!=0) 
        {
            k=n%10;
            fact=1;
            for(i=0;i<=k;i++)
            {
                fact = fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum == temp)
        {
            System.out.println(temp + " is Krishnamurthy Number");
        }
        else
        {
            System.out.println(temp + " is not Krishnamurthy Number");
        }
    }    
}
