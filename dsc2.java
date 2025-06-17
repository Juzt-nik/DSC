//2. Remove duplicates from array
 /* Write a function that inputs an array. This function should return an array that has the
 elements in the same order, but with each element appearing only once. Assume the
 input array is already sorted.
 Example Test Case:
 Input: [2,3,4,4,6,7,7]
 Output: [2,3,4,6,7] */
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
        for(i=0;i<n-1;i++)
        {
            if(ar[i] == ar[i+1])
                ar[i]='#';
        }  
        System.out.print("OUTPUT: [ ");
        for(i=0;i<n;i++)
        if(ar[i] != '#')
        System.out.print(ar[i]+" ");
        System.out.print("]");
    }
}
