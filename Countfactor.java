import java.util.Scanner;
class Countfactor
{
    public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter fact num");
    int n=s.nextInt();
    int  count=0;
    for(int i=1;i<=n/2;i++){ 
        if (n%i==0){
        count++;
        }
    }
    System.out.println("the factor count of given number : "+count);
        
    }
}