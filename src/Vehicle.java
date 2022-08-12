public class Vehicle {
    int numberOfWheels;
    int numberOfDoors;
    int numberOfGears;
    String Color;

    public Vehicle() {
    }

    public Vehicle(int numberOfWheels, int numberOfDoors, int numberOfGears, String color) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.numberOfGears = numberOfGears;
        Color = color;
    }

    public void move(){
    }

    public void steering(String direction){
    }


    public void changeGear(){
    }

    public void increaseSpeed(int speed){
        speed += 1;
    }

    public void decreaseSpeed(int speed){
        speed -= 1;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
