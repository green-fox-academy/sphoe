package petrolstation;
public class Station {

  private int gasAmount;

  public Station() {
    this.gasAmount = 5000;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public int reFill(Car car) {
    gasAmount = gasAmount - car.getCapacity();
    car.setGasAmount(car.getGasAmount() + car.getCapacity());
    return gasAmount;
  }

}
