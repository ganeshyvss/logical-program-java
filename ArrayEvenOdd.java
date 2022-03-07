   class ArrayEvenOdd
   {  
     public static void main(String args[])
   {  
      int a[]={12,22,25,36,33,42,55};  
      System.out.println("Even numbers :");  
         for(int i=0;i<a.length;i++)
        {  
         if(a[i]%2==0){  
       System.out.println(a[i]);  
       }  
   }  
    System.out.println("odd numbers:");  
      for(int i=0;i<a.length;i++)
     {  
      if(a[i]%2!=0)
     {  
    System.out.println(a[i]);  
   }
  }
  }
 }