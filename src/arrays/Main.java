package arrays;


/**
 * @author DATA-DOG team
 */
public class Main {

  public static void main(String[] args) {
    int[] myIntArray;
    myIntArray = new int[10];
    myIntArray[5] = 50;

    double[] doubleArray;
    doubleArray = new double[10];
    doubleArray[2] = 20;

    int[] intArray2 = {1,2,3,4,5,6,7,8,9,10}; //also telling how many numbers there are in array
    printArray(intArray2);

    ScanningArray scanningArray = new ScanningArray();

    scanningArray.printNumbers(5);



  }

  public static void printArray(int[] array) {
    for(int i=0; i < array.length; i++) {
      System.out.println(i);
    }
  }

}
