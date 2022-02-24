import java.util.Scanner;
class Startstop
{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter start num");
    int start=sc.nextInt();
     System.out.println("enter stop num");
    int stop=sc.nextInt();
    for(int i=start+1;i<stop;i++)
{
    System.out.println(i);
}
}
}