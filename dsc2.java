import java.util.*;
class dsc2
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n,i;
        System.out.println("Enter the array size");
        n = sc.nextInt();
        char ar[] = new char [n];
        System.out.println("Enter the Array Elements");
        for(i=0;i<n;i++)
        {
            ar[i] = sc.next().charAt(0);
        }
        System.out.print("INPUT ARRAY ---> [ ");
        for(i=0;i<n;i++)
        System.out.print(ar[i]+" ");
        System.out.print("]");
        System.out.println();
        for(i=0;i<n-1;i++)
        {
            if(ar[i] == ar[i+1])
                ar[i]='#';
        }  
        System.out.print("OUTPUT ARRAY ---> [ ");
        for(i=0;i<n;i++)
            if(ar[i] != '#')
                System.out.print(ar[i]+" ");
        System.out.print("]");
    }
}