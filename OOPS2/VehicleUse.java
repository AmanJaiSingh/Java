// Vehicle  Class
class Vehicle{
    private String color;
    private int maxSpeed;
    
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's Constructor");
        this.maxSpeed=maxSpeed;
    }

    public Vehicle(){
        System.out.println("Vehicle's Constructor");
    }

    public String getColor(){
        return color;
    }
    public int getmaxSpeed(){
        return maxSpeed;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setmaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Vehical  Color "+color+" maxspeed "+maxSpeed);
    }
}
//------------------------------------------------------------------------------
// Car class Extends Vehicle Class 

class Car extends Vehicle{
    int numDoors;

    public Car(int numDoors){
        super(100);
        System.out.println("Car's Constructor");
        this.numDoors=numDoors;
    }

    public void print(){
        System.out.println("Car  Color "+getColor()+" maxspeed "+getmaxSpeed()+" numDoors "+numDoors);
    }
}

//------------------------------------------------------------------------------------
// Bicycle Class Extends Vehicle Class
class Bicycle extends Vehicle{

}

//--------------------------------------------------------------------------------------------
// Truck class Extends Vehical class
class Truck extends Vehicle{
    int maxloadingCapacity;

    public void printtruck(){
        System.out.println("Truck Color "+getColor()+" maxspeed "+getmaxSpeed()+" Max LOading Capacity "+maxloadingCapacity);
    }
} 

//-------------------------------------------------------------------------------------
// Uses of every class
public class VehicleUse {
     

    public static void main(String[] args) {
        
        Vehicle v = new Vehicle();
        v.

        // v.setColor("Red");
        // v.setmaxSpeed(80);;
        // v.print();

        // Car c = new Car(4);
        // c.setColor("Black");
        // c.setmaxSpeed(100);;
        // c.numDoors=4;
        // c.print();

        // Bicycle b = new Bicycle();
        // b.print();

        // Truck t = new Truck();
        // t.setColor("brown");
        // t.setmaxSpeed(70);
        // t.maxloadingCapacity=200;
        // t.printtruck() ;
    }

}
