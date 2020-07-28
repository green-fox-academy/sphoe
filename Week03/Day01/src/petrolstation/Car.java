package petrolstation;

public class Car {
  private int gasAmount;

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  private int capacity;

  public Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public int getCapacity() {
    return capacity;
  }
}
