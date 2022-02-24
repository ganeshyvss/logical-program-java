import java.util.Scanner;
class Reversenum
{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    for(int i=n;i>=1;i--)
{
    System.out.println(i);
}
}
}