//[Special Number --> Addition of multipliction & addition of each digit present in the number given by user 
// is same as the number given by user 
// For example- 49=4+9 + 4*9 = 49]

import java.util.*;
public class Special_No
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
        if((sum+mul) == temp)
        {
            System.out.println(temp + " is Special Number");
        }
        else
        {
            System.out.println(temp + " is not Special Number");
        }
        sc.close();
    }    
}
