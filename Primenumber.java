import java.util.Scanner;
class Primenumber{
    public static void main(String[]args)
{
     int count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;i<n;i++)
{
    if(n%i==0)
    {
    count=count+1;
}
}
if(count==0)
{
    System.out.println("prime number");
}

else
{
    System.out.println("not a prime number");
}
}
}

