import java.util.Scanner;
class example1
{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter units of current used:");
    double units=sc.nextDouble();
    double charge=34.50;
    double bill=units*charge;
    System.out.println("total bill excluding gst is : "+bill);
    double totalbill=(bill*18)/100;
    System.out.println("The  GST of the bill : "+ totalbill);
    System.out.println("The bill with GST is : "+ (totalbill+bill));
    
}
}