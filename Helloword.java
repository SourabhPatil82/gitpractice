import java.util.Scanner;

// Your First Program

class Helloworld {
    public static void main(String[] args) {
       // System.out.println("Hello, World!"); 
         int a;
         System.out.println("Enter the no");
         Scanner sc =new Scanner(System.in);
         a=sc.nextInt();
         System.out.println("Your number is"+ a);
         
             sc.close();
    }
}