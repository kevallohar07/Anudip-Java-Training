interface animal {
void walk();
void eat();
}
interface cat {
    void run();
    
}

class dog implements animal,cat{
    public void walk(){
        System.out.println("this is walk method");
    }
    public void eat(){
        System.out.println("this is eat method");
    }
    public void run(){
        System.out.println("this is a cat run");
    }
}
public class Demo {
    public static void main(String[] args) {
        dog d = new dog();
        d.walk();
        d.eat();
        d.run();
    }
}
