package composition;

/**
 * @author DATA-DOG team
 */
public class Main {
  public static void main(String [] args) {
    Dimensions dimension = new Dimensions(25,45, 58);
    Case theCase = new Case("220b", "Dell", "240", dimension);
    Resolution resolution = new Resolution(300,200);
    Monitor monitor = new Monitor("P2317H", "DELL", 27, resolution);
    Motherboard motherboard = new Motherboard("Intel", "Intel", 5200, 45, "v.2.3");

    PC pc = new PC(theCase, monitor, motherboard);


    System.out.println(pc.getMonitor().getModel());
  }

}
