//[Armstrong No --> cube of each digit of given number is same as given number
//For example- 153 = 1^3 + 5^3 + 3^3 = 153]

import java.util.*;
public class Armstrong_No
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        //accept the number from user
        int n = sc.nextInt();
        //initialize the arm variable
        int arm=0;
        //save originalNumber in temp variable
        int temp=n;   
        int k;
        while(n>0)
        {
            k = n%10;
			arm = arm+k*k*k;
			n = n/10;
        }
        //now check whether the number is armstrong or not
        if(arm==temp)
        {
            System.out.println(temp + " is Armstrong No");
        }
        else
        {
            System.out.println(temp + " is not Armstrong No");
        }
        //close the sc 
        sc.close();
    }
}