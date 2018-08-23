package composition;

/**
 * @author DATA-DOG team
 */
public class Case {
  private String model;
  private String manugacturer;
  private String powerSpupply;
  private Dimensions dimensions;


  public Case(String model, String manugacturer, String powerSpupply, Dimensions dimensions) {
    this.model = model;
    this.manugacturer = manugacturer;
    this.powerSpupply = powerSpupply;
    this.dimensions = dimensions;
  }

  public void pressPowerButton() {
    System.out.println("Power button pressed");
  }

  public String getModel() {
    return model;
  }

  public String getManugacturer() {
    return manugacturer;
  }

  public String getPowerSpupply() {
    return powerSpupply;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }
}
