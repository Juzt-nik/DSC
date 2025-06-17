// 4. The bottle shipping problem
/* A company manufactures packing cartons in four sizes: small, medium, large and xl.
 These cartons can hold 6 bottles, 12 bottles, 24 bottles and 48 bottles respectively.
 Write a function that inputs the number of bottles to be shipped by the company. The
 function should print the break-up of the number of cartons used in descending order of
 capacity.
 Example Test Case:
 Input: 140
 Output: 2 xl, 1 large, 1 medium, 1 small */
import java.util.*;
class dsc4
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n,i=0     ;
        System.out.println("Enter the Total Number of Bottles");
        n= sc.nextInt();
        int a[] = {48,24,12,6};
        String b[]={" xl"," large"," medium"," small"};
        while(i<3)
        {
            if(n%a[i]!=0)
            {System.out.print((n/a[i])+ b[i]+", ");n=n-(a[i]*(n/a[i]));i++;}
            else
            break;
        }
        n/=a[i];
        if(n!=0 && i>2)
        System.out.print((n+1) + b[i]);
        else
        System.out.print(n + b[i]);
    }
}
 
