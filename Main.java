public class Main{
    public static void main(String[] args) {

        // Fortsätt på klassen Vehicle i föregående exempel. Skapa en konstruktor som har två parametrar
        // String type och en int amountOfWheels.
        // Skapa en ny metod i Vehicle som heter displayAmountOfWheels. Den skriver ut type + amountOfWheels.
        // Låt en subklass ärva från Vehicle och anropa metoden displayAmountOfWheels utan att overrida den.



    Car car1 = new Car("Car");
    Car car2 = new Car("car", 4);

    Motorcycle motorcycle1 = new Motorcycle("Motorcycle");

  
        //---KÖR KOD---//

        car1.drive();
        motorcycle1.drive();

        car2.displayAmountOfWheels();


    }
}