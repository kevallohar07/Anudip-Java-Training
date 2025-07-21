public class student1 {
    private String Name;
    private int Age;
    private String Department;

    student1( String n,int a,String d){
           this.Name=n;
           this.Age=a;
           this.Department=d;
    }
    public  String getName(){
        return Name;
    }
    public void setName(String Na){
        this.Name=Na;
    }
    public int getAge(){
        return Age;
    }
    public void setAge( int ag){
        this.Age=ag;      
    }
    public String geDepartment(){
        return Department;
    }
    public void setDepartment( String Dept){
        this.Department=Dept;

    }
    void Display(){
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Department);
    }
    public static void main(String[] args) {
        student1 s=new student1("Dinesh",20,"Computer_Science");
        s.Display();



        
    }
    
}
