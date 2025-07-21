import java.util.*;

class demo {
   int add(){
    int a = 10;
    int b = 30;
    int sum = a+b;
    return sum;

    }
    
}

 class Hello {

    int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    int prod(int a, int b){
        int prod = a*b;
        return prod;
    }
     public static void main(String[] args) {
        Hello h = new Hello();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =h.add(a,b);
        int prod=h.prod(a, b);
        System.out.println("this is my sum :" +sum);
        System.out.println("prod of a and b :"+prod);

        demo d = new demo();
        int p = d.add();
        System.out.println(p);
     }
}