 import java.util.*;
  public class program1
 {

     public static void main(String[] args)
     {
         int res;
         System.out.println("Enter value of a&b:");
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();

        System.out.println("1.Addition"); 
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division"); 
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:res = a+b;
            System.out.println("sum is : "+res);
            break;
             case 2:res = a-b;
            System.out.println("difference is : "+res);
            break;
             case 3:res = a*b;
            System.out.println("Multiplication is : "+res);
            break;
             case 4:res = a/b;
            System.out.println("division is : "+res);
            break;
            default:System.out.println("invalid choice");
        }
 }                                         
}