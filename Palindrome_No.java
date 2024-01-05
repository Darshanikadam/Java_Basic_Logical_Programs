//[Palindrome Number --> The reverse of the given number is same as the number given by user
// For example- 121=121]

import java.util.*;
public class Palindrome_No
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int k;
        int rev=0;
        int temp=n;

        while(n>0)
        {
            k=n%10;
            rev=rev*10+k;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println(temp + " is Palindrome No");
        }
        else
        {
            System.out.println(temp + " is not Palindrome No");
        }
        sc.close();
    }
}