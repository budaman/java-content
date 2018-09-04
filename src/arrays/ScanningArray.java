package arrays;

import java.util.Scanner;

/**
 * @author DATA-DOG team
 */
public class ScanningArray {

  private static Scanner scanner = new Scanner(System.in);

  public static void printNumbers(int number) {

    int[] myIntegers = getIntegers(number);

    for(int i=0; i<myIntegers.length; i++) {
      System.out.println("Element " + i + " value was " + myIntegers[i]);
    }

  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values.\r");
    int[] values = new int[number];
    for(int i=0; i< values.length ; i++) {
      values[i] = scanner.nextInt();
    }

    return values;
  }
}
