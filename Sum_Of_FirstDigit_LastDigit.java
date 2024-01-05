import java.util.*;
public class Sum_Of_FirstDigit_LastDigit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int n2=n;
        int n1=n%10;
        int n3=0;

        while(n2>0)
        {
            n3=n2%10;
            n2=n2/10;
        }
        int sum = n1+n3;

        System.out.println("Sum of the First Digit & the Last Digit of the given Number is : "+sum);

        sc.close();
    }  
}
