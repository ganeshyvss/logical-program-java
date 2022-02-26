//write a program to print sum of even digits and sum of odd digits of a given number//


import java.util.Scanner;
class Whileevenodd{
    public static void main(String[]args)
{ 
    Scanner sc=new Scanner(System.in);
    int i=0;int evensum=0;int oddsum=0;
    System.out.println("enter num");
    int n=sc.nextInt();
    while(i<n)
    {
        System.out.println(i);
        evensum=evensum+i;
        i=i+2;
    }
    System.out.println("the sum of even is:"+evensum);
    i=1;
    while(i<n)
    {
        System.out.println(i);
        oddsum=oddsum+i;
        i=i+2;
    }
    System.out.println("the sum of odd is:"+oddsum);
}
}

    