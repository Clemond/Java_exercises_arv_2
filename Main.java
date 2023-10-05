public class Main{
    public static void main(String[] args) {
      
    // Skapa en klass som heter Vehicle, klassen ska ha en metod som heter drive() 
    // Skapa en ny klass som också är av typ vechicle, ex motorcycle, car. Låt den klassen ärva Vehicle.
    // Overrida metoden drive() från Vehicle och skriv ut din egen text i metoden.


    Car car1 = new Car("Car");

    Motorcycle motorcycle1 = new Motorcycle("Motorcycle");

  
        //---KÖR KOD---//

        car1.drive();
        motorcycle1.drive();


    }
}