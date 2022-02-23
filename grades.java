import java.util.Scanner;
class grades {
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter project marks");
    int project=sc.nextInt();
     System.out.println("enter external marks");
    int external=sc.nextInt();
     System.out.println("enter internal marks");
    int internal=sc.nextInt();
     if(project>50 && external>50 && internal>50)
     {
         System.out.println("student is passed");
          int total=(project*70/100+external*20/100+internal*10/100);
          System.out.println("tha total marks is:"+total);
    
     if( total>=90)
     {
         System.out.println("A grade");
     }
    else  if(total>=75 && total<90)
     {
         System.out.println("B grade");
     }
     else
     {
         System.out.println("C grade");
     }
     }
     else{
         if(project<50){
         System.out.println("FAILED in project"+project);
     }
           if(external<50){
         System.out.println("FAILED in external"+external);
     }
              if(internal<50)
     {
         System.out.println("FAILED in internal"+internal);
     }

     }
}
}  


