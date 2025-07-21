import java.util.*;

class person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String nm){
        this.name=nm;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        person p = new person();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string :");
        String nm = sc.nextLine();
        p.setName(nm);
        String s =p.getName();
        System.out.println(s);
    }
}
