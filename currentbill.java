import java.util.Scanner;
  public class currentbill
   {
       
       public static void main(String[]args)
   {
       double currentbill;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter units");
      int units=sc.nextInt();
      if(units<=50)
      {
          currentbill=units*0.50;
        }
      else if(units<=150)
      {
          currentbill=(50*0.50)+(units-50)*0.75;
      }
      else if(units<=250)
      {
          currentbill=(50*0.50)+(100*0.75)+(units-150)*1.25;
      }
      else
      {
           currentbill=(50*0.50)+(100*0.75)+(100*1.25)+(units-250)*2.25;
      }
         double gst=(currentbill/18)*100;
      System.out.println("the bill amount is "+ currentbill);
       System.out.println("the gst amount is "+ gst);
      currentbill=currentbill+gst;
       System.out.println("the total bill and gst is "+ currentbill);
   }
   }