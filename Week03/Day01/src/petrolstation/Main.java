package petrolstation;

public class Main {
  public static void main(String[] args) {
    /*Create Station and Car classes
    Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    Car
    gasAmount
    capacity
    create constructor for Car where:
    initialize gasAmount -> 0
    initialize capacity -> 100 */

    Car volvo = new Car(0, 100);
    Car skoda = new Car(0, 50);
    System.out.println(skoda.getGasAmount());
    Station shell = new Station();

    System.out.println(shell.reFill(skoda));
    System.out.println(shell.reFill(volvo));
    System.out.println(skoda.getGasAmount());
  }
}