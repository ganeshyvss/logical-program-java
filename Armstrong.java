import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args)
{
    int temp=0;int amstrong=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number to check Armstrong or not : ");
    int n=sc.nextInt();
    int original=n;
    while(n>0)
 {
    temp=n%10;
    temp=(int)Math.pow(temp, 3);
   amstrong=amstrong+temp;
   n=n/10;
}
    if(amstrong==original){
   System.out.println("the number is a armstrong");
}
else{
    System.out.println("the number is not a armstrong");
}
}
}