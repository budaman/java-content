package composition;

/**
 * @author DATA-DOG team
 */
public class Dimensions {
  private int witdth;
  private int height;
  private int depth;

  public Dimensions(int witdth, int height, int depth) {
    this.witdth = witdth;
    this.height = height;
    this.depth = depth;
  }

  public int getWitdth() {
    return witdth;
  }

  public int getHeight() {
    return height;
  }

  public int getDepth() {
    return depth;
  }
}
