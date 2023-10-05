public class Vehicle {

    private String type;
    private int amountOfWheels;
    private String typeOfVehicle;
    String terrainType;
    int topSpeed;


    //Konstruktor
    //Setter
    public Vehicle(String type, int amountOfWheels){
        this.type = type;
        this.amountOfWheels = amountOfWheels;
    }

    //Method
    public void displayAmountOfWheels(){
        System.out.println(type + ": " + amountOfWheels);
    }

    //Setter
    public Vehicle(String typeOfVehicle){
        this.typeOfVehicle = typeOfVehicle;
    }

    public void drive(){
        System.out.println(typeOfVehicle + " is driving right now!");

    }
}
