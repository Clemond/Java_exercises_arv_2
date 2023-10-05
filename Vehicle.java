public class Vehicle {

    private String typeOfVehicle;
    String terrainType;
    int topSpeed;


    //Setter
    public Vehicle(String typeOfVehicle){
        this.typeOfVehicle = typeOfVehicle;
    }

    

    public void drive(){
        System.out.println(typeOfVehicle + " is driving right now!");

    }
}
