//[Automorphic Number --> For example- Square of 5=25 and square of 25=625 last two digit of 625 is same as square of given number] 

import java.util.*;
public class Automorphic_No
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int temp = n;

        while(n>0)
        {
            int k=n%10;
            n=n/10;
        }
        int square = temp*temp;
        while(square > 0)
        {
            int n1=square%10;
            square=square/10;
        }
        if(square == temp)
        {
            System.out.println(temp + " is automorphic Number");
        }
        else
        {
            System.out.println(temp + " is not automorphic Number");
        }
        sc.close();
    }
}