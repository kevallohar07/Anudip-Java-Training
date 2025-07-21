abstract class animal{
    abstract void animalsound();

    public void animal1(){
        System.out.println("this is animal class");
    }
}

class dog extends animal{
    public void animalsound(){
        System.out.println("this is dog class");
    }
}
public class abstration {
    public static void main(String[] args) {
        dog d = new dog();
        d.animalsound();
        d.animal1();
    }
}
