
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

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

public class CombinedProgram {
    public static void main(String[] args) {
       
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        Garage myGarage = new Garage();

        myGarage.serviceVehicle(myCar);
        myGarage.serviceVehicle(myMotorcycle);

        System.out.println();

        
        Student s1 = new Student();                          
        Student s2 = new Student("Aarav", 21);               
        Student s3 = new Student("Meera", 20, "Mechanical"); 

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}