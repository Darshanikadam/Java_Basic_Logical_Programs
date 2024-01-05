//[Duck Number --> if the number given by user contains 0]

import java.util.*;
public class Duck_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

       // int temp = n;
        int k=0;

        while(n>0)
        {
            k=n%10;
            n=n/10;
        }
        if(k == 0)
        {
            System.out.println("given number is Duck Number");
        }
        else
        {
            System.out.println("given number is not Duck Number");
        }
        sc.close();
    }    
}
