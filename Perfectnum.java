import java.util.Scanner;
 class Perfectnum
 {
     public static void main(String[]args)
 {
     int sum=0;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n/2;i++)
         {
             if(n%i==0)
             {
                 sum=sum+i;
             }
         }
             if(sum==n)
             {
                 System.out.println("perfect number");
             }
            else
            {
                System.out.println("not a perfect number"); 
            }
         }
     
 }