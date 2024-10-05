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
 
