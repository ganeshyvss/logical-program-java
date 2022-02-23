import java.util.Scanner;
class example4
{
    public static void main(String[]args)
{
    int hra, da;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter basic salary");
    int basic=sc.nextInt();
    if(basic<=10000)
     {
         hra=(basic/100)*62;
         da=(basic/100)*78;
         int gs=hra+da+basic;
         System.out.println("the gross salary amount :"+gs);
     }
     else if(basic>10000 && basic<=20000)
     {
         hra=(basic/100)*69;
          da=(basic/100)*87;
         int gs=hra+da+basic;
         System.out.println("the gross salary amount :"+gs);
     }
     else if(basic>20000)
     {
        hra=(basic/100)*78;
          da=(basic/100)*89;
         int gs=hra+da+basic;
         System.out.println("the gross salary amount :"+gs); 
     }
}
}
     
     
     
     