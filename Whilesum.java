// write a program to print sum of all digits in given number//

import java.util.Scanner;
class Whilesum{
    public static void main(String[]args)
{
    int count=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num!=0)
    {
        num=num/10;
        count=count+1;
    }
   System.out.println(count);
}
}