import java.util.Scanner;

class Demo{
    public void fun(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        int c = a/b;
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("this will terminate the program");
    }
    }
}

public class exception {
    public static void main(String[] args) {
       Demo d = new Demo();
       d.fun(); 
    }
}
