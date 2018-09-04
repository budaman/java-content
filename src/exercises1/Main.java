package exercises1;

import java.util.*;

/**
 * @author DATA-DOG team
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //integer array
        Integer[] cubes = new Integer[] { 8, 27, 64, 125, 256 };
        Arrays.sort(cubes, Collections.reverseOrder());
        System.out.println(Arrays.toString(cubes));

        //primitive array
        System.out.println("write a number : ");
        int numberOfArray = scanner.nextInt();
        System.out.println(numberOfArray);
        int[] primitiveArray;
        primitiveArray = new int[numberOfArray];

        for(int i = 0; i<numberOfArray; i++) {
            primitiveArray[i] = scanner.nextInt();
        }
    }


}
