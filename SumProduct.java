import java.util.Scanner;


class SumProduct {

    public static void mul(int a, int b) {
        int c = a*b;
        System.out.println("product is " + c);
    }
    public static void sum(int a, int b){
        int sum=a+b;
        System.out.println("sum is " + sum);
    }

    
    
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter a number");
 int a = sc.nextInt();
 System.out.println("enter a number 2 :");
 int b = sc.nextInt();


 mul(a, b);
 sum(a,b);


 }
}