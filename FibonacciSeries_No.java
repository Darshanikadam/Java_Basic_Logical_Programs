//[Fibonacci series --> the series of addition of first two terms present in the series is current number
// For example- 0,1,1,2,3,5,8,.......]

import java.util.*;
public class FibonacciSeries_No 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int no = sc.nextInt();
        
        int first_no = 0;
        int second_no = 1;
        
        int i=2;
        int count=10;

        while(i<=count)
        {
            second_no=no+first_no;
            System.out.println(second_no);
            no=first_no;
            first_no=second_no;
            i++;
        }
        
        sc.close();
    }    
}
