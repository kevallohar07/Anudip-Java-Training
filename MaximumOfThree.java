import java.util.Scanner;
public class MaximumOfThree {
    public static void max(int a, int b, int c){
     if(a>b && a>c){
      System.out.println("number a is greater.");
     }
      else if(b>a && b>c){
        System.out.println("Number b is greater");

      }
      else{
        System.out.println("C is greater");
      }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b= sc.nextInt();
    System.out.println("Enter third number:");
    int c = sc.nextInt();

    max(a,b,c);
    }
}