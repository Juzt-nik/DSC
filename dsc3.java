 //3. Print the date based on the entered day and year
 /* Write a function that inputs two integers: the day number and the year. This function
 should generate a string that has the entire date with the date, month and year
 mentioned. Ensure that the function also considers leap years.
 Example Test Case:
 Inputs: 256, 2021
 Output: “13 September, 2021” */
import java.util.*;
class dsc3
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String n,x,x1,result;
        int i=0;
        n=sc.nextLine();
        String mon[] = {" January"," February"," March"," April"," May", " June"," July"," August"," September"," October"," November"," December"};
        int ch= n.indexOf(',');
        x=n.substring(ch+1);x1=n.substring(0,ch);
        int c=Integer.valueOf(x1);
        int y=Integer.valueOf(x.trim());
        if(y%4==0)
        {
           int day[] = {31,29,31,30,31,30,31,31,30,31,30,31}; 
           while(i<12)
            {
                c=c-day[i];i++;
                if(c < day[i+1]+1)
                break;
            }
            result = (""+c) + mon[i]+","+x;
            System.out.println(result); 
        }
        else
        {
            int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
            while(i<12)
            {
                c=c-day[i];i++;
                if(c < day[i+1]+1)
                break;
            }
            result = (""+c) + mon[i] +","+ x;
            System.out.println(result);
        }
    }
}
