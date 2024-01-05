//[Prime Number --> 2,3,5,7,......]

import java.util.*;
public class Prime_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int flag=0;
        int i=2;

        while(i<n)
        {
            if(n%i == 0)
            {
                flag=1;
            }
            i++;
        }
        if(flag == 0)
        {
            System.out.println(n + " is Prime Number");
        }
        else
        {
            System.out.println(n + " is not Prime Number");
        }
        sc.close();
    }    
}
