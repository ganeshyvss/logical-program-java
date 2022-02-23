import java.util.Scanner;
class example{
public static void main(String[]args)
{
    int totalmarks=0;int projectmarks;int externalmarks;int internalmarks;
 Scanner s=new Scanner(System.in);
 System.out.println("enter project percent marks :");
  int project=s.nextInt();
  System.out.println("enter external marks percent :");
  int external=s.nextInt();
  System.out.println("enter internal marks percent :");
  int internal=s.nextInt();
  
  projectmarks=(project*70)/100;
  externalmarks=(external*20)/100;
  internalmarks=(internal*10)/100;
  
  totalmarks=(projectmarks+externalmarks+internalmarks);
  System.out.println("Total marks of a student : "+totalmarks);
}
}