package referencesVsValueTypes;

import java.util.*;

/**
 * @author DATA-DOG team
 */
public class Main {
    public static void main(String[] args) {

        //value types are not related with each other even they inherits value

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        anotherIntValue ++;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);


        //reference type value shares the same object (does not create new object), so if value changes one of reference source - that change all the object in in all arrays the
        //value is changed
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[1] = 5;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

    }
}
