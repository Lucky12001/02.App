  // import java.util.*;
  // public class Basics{
  //     public static void main(String args[]) {
  //      Scanner sc = new Scanner(System.in);
  //      System.out.println("Enter your choice = 1 , 2, 3 ");
  //      int choice = sc.nextInt();
  //      switch(choice){
  //        case 1:
  //        System.out.println(" Option 1 is  Samosa");
  //        break;
  //        case 2:
  //        System.out.println("Option 2 is Salad");
  //        break;
  //      case 3:
  //        System.out.println("Option 3 is Tea");
  //        break;
  //        default:
  //        System.out.println("Invalid Request :");
  //       break;
  //      }
  //       sc.close();
  //   }
  // }

// import java.util.*;
// public class Basics
// { public static void main(String args[])
//     {
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("enter a : ");
//        int a= sc.nextInt();
//        System.out.println("enter b : ");
//     int b = sc.nextInt();
//     System.out.println("enter operator : ");
//     char operator = sc.next().charAt(0);
//     switch(operator) {
//         case '+' : System.out.println(a+b);
//         break;
//         case '-' :System.out.println(a-b);
//         break;
//         case '*' : System.out.println(a*b);
//         break;
//         case '/' :System.out.println(a/b);
//         break;
//         case '%' : System.out.println(a%b);
//         break;
//         default : System.out.println("Invalid, Please enter a valid sign");
//         break;
//     }
//     sc.close();
// }
// }
// import java.util.*;
// public class Basics {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your Age : ");
//         int age = sc.nextInt();
//      if(age >=18) {
//         System.out.println("Adult : Drive, vote");
//      }
//      if (age >13 && age < 18){
//         System.out.println(" Teenager ");
//      }
//      else{
//         System.out.println("Not Adult...");
//      }
//     }
// }
// import java.util.*;
//  public class Basics{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a :");
//         int a= sc.nextInt();
//     System.out.println("Enter b :");
//         int b= sc.nextInt();
//         if (a>=b) {
//             System.out.println("A is largest of 2");
//         }
//         else {
//             System.out.println("B is largest of 2");
//         }
//     }
//  }
// import java.util.*;
// public class Basics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int no = sc.nextInt();
//         if (no % 2 ==0) {
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }
// import java.util.*;
// public class Basics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age >=18){
//             System.out.println("Adult");
//         }
//         else if (age >=13 && age <18){
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Child");
//         }
//     }
// }
// import java.util.*;
// public class Basics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in)
//         int in = sc.nextInt();
//         if (in < 500000){
           
//         }
//     }
// }
/*  public class Basics {
    public static void main(String args[])
{
    System.out.println(" Believe In YourSelf Buddy... ");
}
}*/

/* ------------------------------------Exmaple of Documentation Comments----------------------------------------
*public class Basics{
 *   public static void main(String args[])
  *  {
   *     int a = 10;
    *    int b = 20;
     *   int c = a + b;
      *  System.out.println("Sum of a + b is" +c);

    *}    
*} 
           Conditional/Ternary Operators 
     ============================================================================================
     Ternary operator is used for decision making , it is also known as conditional operator .
    =============================================================================================

 class Operators {
  public static void main(String args[]) 
  {
    int a= 5;
     int b= 10;

     String s = (a<b)? "yes" : "no";

     System.out.println(s);
   }                                            Syntax :    (condition) ? expression1 : expression2 ;
 }
 */

 /*
  * =====================================
      Instanceof Operator
    =====================================
     ************** It is used to check object reference belong to a class or not ****************
     
     String str= "ashokit";
     if(str instanceof String) {
             //logic 
     }


     =============================
       New Operator
     =============================
     ----------------------------------------------------
     It is used to create the object for a class.
         
          ClassName refVar = new ClassName ();
      
      Creating object means allocating memory in Heap Area.
     ----------------------------------------------------
     
     ======================================
       Dot (.) Operator
     ======================================
     -------------------------------------------------  
     It is used to access class variables & methods.  
     -------------------------------------------------
  */
 


/*=======================================
 *    Control Statement
 * ======================================
 *  > java program code will execute line by line sequentially (this is default behavoiour)
 * 
 * >In project code should execute based on user operation
 * 
 * >To satisfy user requirements our code should execute based on some conditions
 *    
 * > Using Control Statement we can control program execution flow
 * 
 * > Control Statements ate divided into 3 types 
 * 1) Decision Making Statements /ConditionalStatements
 * 
 *  2) Looping Statements
 * 
 * 3) Transfer/ Branching Statements
 * 
 * 1-------------- Conditional Statements ---------------------------------------
 *  1. Simple if
 *  2. if-else -if-else  ( if else ladder)
 *  3. if-else
 *  4.Switch 
 *  
 * 2--------------  Looping Statements  ------------------------------------------
 *   1.While loop
 *   2.do-while loop
 *   3. for loop
 *   4. for-each loop
 * 
 *  3---------------- Branching / Transfer Stetements -----------------------------
 *   1.break
 *   2. continue
 *    3. return 
 */
