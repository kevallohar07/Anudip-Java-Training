
public class HollowDiamond {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 3 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = -1; j <= i * 2 - 1; j++) {
                if ((i == 0) || (j == -1 || j == i * 2 - 1)) {
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int k = 3 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = -1; j <= i * 2 - 1; j++) {
                if ((i == 0) || (j == -1 || j == i * 2 - 1)) {
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
