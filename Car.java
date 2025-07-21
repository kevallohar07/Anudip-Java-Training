public class Car {
    String Make;
    String Model;
    short Year;
    int Price;
Car(String m,String mo,short y,int P){
    this.Make=m;
    this.Model=mo;
    this.Year=y;
    this.Price=P;     
}
  void Display(){
       System.out.println("Car Details");
       System.out.println(Make);
       System.out.println(Model);
       System.out.println(Year);
       System.out.println(Price);
  }
    public static void main(String[] args) {
        Car c = new Car("Maruti_Suzuki", "Ertiga",(short)2024,300000000);
        c.Display();

        
        
    }
    
}
