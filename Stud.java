
class Student {
    String name;
    int age;
    String department;

  
    public Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

   
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}


public class Stud {
    public static void main(String[] args) {
       
        Student s1 = new Student();                          
        Student s2 = new Student("Aarav", 22);                
        Student s3 = new Student("Priya", 21, "Mechanical");  

        
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}