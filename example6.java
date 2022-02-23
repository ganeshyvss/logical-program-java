import java.util.Scanner;
class example6{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num ");
    int num=sc.nextInt();
      if (num==0)
    {
       System.out.println("num is zero");  
    }   
    else if(num%2==0)
    {
        System.out.println("num is even");
    }
   else if(num%2!=0)
   {
       System.out.println("num is odd");
   }
  
   }
    
}
