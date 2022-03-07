import java.util.Scanner;
public class Amount {
    public static void main(String args[]) 
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        if(n%100==0)
        {
            if(n>=500)
            {
             count=n/500;
             n=n-(count*500);
        System.out.println("500 counts are :"+count);
            }
          if(n>=200)
            {
             count=n/200;
             n=n-(count*200);
            
        System.out.println("200 notes are :"+count);
            }
          if(n>=100)
            {
             count=n/100;
             n=n-(count*100);
            
        System.out.println("100 notes are :"+count);
            }
        }
        else
        {
             System.out.println("invalid");
        }
    }
}