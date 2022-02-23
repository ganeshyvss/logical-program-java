import java.util.Scanner;
class example5
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a");
        int a=sc.nextInt();
         System.out.println("enter b");
        int b=sc.nextInt();
         System.out.println("enter c");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("the biggest number is a:"+a);
        }
       else if(b>a && b>c) 
       {
            System.out.println("the biggest number is b:"+b);
       }
       else 
       {
            System.out.println("the biggest number is c:"+c);
       }
    }
}