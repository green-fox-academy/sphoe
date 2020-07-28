package fleeofthings;
public class FleetOfThings {

  public static void main(String[] args) {

    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Fleet toDo = new Fleet();

    Thing complete3 = new Thing("Stand up");
    //complete3.setName("sit down");
    Thing complete4 = new Thing("Eat lunch");
    toDo.add(new Thing("Get Milk"));
    toDo.add(new Thing("Remove the obstacles"));
    complete3.complete();
    toDo.add(complete3);
    complete4.complete();
    toDo.add(complete4);

    System.out.println(toDo);
  }
}
