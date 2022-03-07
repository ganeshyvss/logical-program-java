import java.util.Scanner;
public class Productdigit
{
    public static void main(String[]args)
    {
        int temp=0;int product=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        while(num!=0)
        {
            temp=num%10;
            product=product*temp;
            num=num/10;
        }
        System.out.println("the sum of digits of number :"+product);
    }
}