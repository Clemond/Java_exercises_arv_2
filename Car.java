public class Car extends Vehicle {

    public Car(String typeOfVehicle) {
        super(typeOfVehicle);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void drive(){
        System.out.println("Nu är denna overridad!");
    }

    
}
