

    class parent{
        public int class1(int a, int b ){
           int c = a+b;
           return c;
        }
    }
    class child extends parent{
        public int class2(int a, int b) {
            int c = a-b;
           return c;
        }
    }

    class child1 extends child {
        public int class3(int a, int b){
           int c = a*b;
           return c;
        }
    
        
    }
    public class inheritance {
    public static void main(String[] args) {
        child1 c = new child1();
        /*Scanner sc = new Scanner(System.in);
        System.out.print("enter a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();*/
        c.class1(1, 2);
        c.class2(2, 1);
        c.class3(3, 1);
    }
}
