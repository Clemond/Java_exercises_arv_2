public class Car extends Vehicle {

    public Car(String typeOfVehicle) {
        super(typeOfVehicle);
        //TODO Auto-generated constructor stub
    }

    public Car(String type, int amountOfWheels){
        super(type, amountOfWheels);
    }

    @Override
    public void drive(){
        System.out.println("Nu är denna ");
    }

    
}
