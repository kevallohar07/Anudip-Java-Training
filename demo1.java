interface dog {
    void walk();
    void eat();
    static void sleep(){
        System.out.println("dog is sleeping");
    }
    default void small(){
        System.out.println("dog is small");
    }
}
 interface cat {
    void run();
    
}
class animal implements dog,cat{
    public void walk(){
        System.out.println("dog is walking");
    } 
    public void eat(){
        System.out.println("dog is eating");
    }
    public void run(){
        System.out.println("cat is running");
    }
}
public class demo1 {
    public static void main(String[] args) {
       animal a = new animal();
       a.walk();
       a.eat();
       a.run(); 
       dog.sleep();
       a.small();
    }
}
