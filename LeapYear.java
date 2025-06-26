import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter year:");
        int y = sc.nextInt();

        if(y%4 == 0){
            System.out.println("Entered year is a leap year.");

        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}
