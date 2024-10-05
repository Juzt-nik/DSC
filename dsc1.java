import java.util.*;
class dsc1
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String s;
        int i,a=0; 
        System.out.println("Enter the String");
        s=sc.nextLine().toLowerCase();
        StringTokenizer stz = new StringTokenizer(s," ");
        a=stz.countTokens();
        String ar[] = new String [a];
        for(i=0;i<a;i++)
        {
            ar[i] = stz.nextToken();
        }
        for(i=0; i<a-1; i++)   
        {     
            if(ar[i].length() > ar[i+1].length())   
            {  
                String temp = ar[i+1];
                ar[i+1]=ar[i];
                ar[i]=temp;
            }  
        } 
        for(i=0;i<a;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
        


