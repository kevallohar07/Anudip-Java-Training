abstract class dog {
    abstract void walk();
    abstract void eat();
dog(){
    System.out.println("this is a dog class");
}
}

class animal extends dog {
    public void walk(){
        System.out.println("dog is walk");
    }
    public void eat(){
        System.out.println("dog is eating");
    }
    animal(){
        System.out.println("this is a animal class");
    }
}
public class cons {
    public static void main(String[] args) {
        animal a = new animal();
        a.walk();
        a.eat();
    }
}
