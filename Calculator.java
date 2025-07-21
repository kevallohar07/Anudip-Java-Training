public class Calculator {

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum=c.add(1, 02);
        System.out.println(sum);
        int sum1=c.add(1, 02, 03);
        System.out.println(sum1);
        int sum2=c.add(1200, 1200);    
        System.out.println(sum2);  
    }
    
}
