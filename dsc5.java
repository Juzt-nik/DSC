import java.util.*;
class dsc5
{
    int f,r,cap;
    int ar[];
    dsc5(int x)
    {
        ar = new int [x];
        f=-1;r=0;cap=x;
    }
    void push ()
    {
        Scanner sc  =  new Scanner (System.in);
        if(f==cap-1)
        System.out.println("Stack is Full");
        else
        {
            System.out.println("Enter the Element");
            int v=sc.nextInt();
            ar[++f] = v;
        }
    }
    int pop ()
    {
        if(r==f)
        return -9999;
        else
        return ar[r++];
    }
    void peek()
    {
        System.out.println("Elements present in stack");
        for(int i=f;i>=r;i--)
        System.out.print (ar[i] +" ");
        System.out.println();
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int cap;char ch1 = 'Y';
        System.out.println("Enter the Total Capacity of Stack");
        cap = sc.nextInt();
        dsc5 ob = new dsc5 (cap);
        while(true)
        {
            if(ch1 == 'Y')
            {
                System.out.println("Enter A to push a element, B to pop a element, C to peek into the stack");
                char ch = sc.next().charAt(0);
                switch(ch)
                {   
                    case 'A' : {ob.push();break;}
                    case 'B' : {int k = ob.pop();System.out.println("Element Poped : "+k);break;}
                    case 'C' : {ob.peek();break;}
                    default : {System.out.println("Enter a valid option");break;}
                }  
                System.out.println("Do you want to continue -- Type Y for Yes and N for No");
                ch1 = sc.next().charAt(0);
            }
            else
            {
                System.out.println("EXIT");break;
            }
        }
    }
}
            
        
    
