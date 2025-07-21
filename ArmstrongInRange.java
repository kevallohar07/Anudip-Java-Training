import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        
        printArmstrongNumber(start, end);

        sc.close();
    }

    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;

            while (originalNum != 0) {
                int digit = originalNum % 10;
                int cube = 1;

                
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                originalNum /= 10;
            }

            
            
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}