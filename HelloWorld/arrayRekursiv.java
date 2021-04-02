import java.util.*;
public class arrayRekursiv {

public static void main(final String[] args) {

    String[] array = {"h", "e", "l", "l", "o"};
    printArray(array);
    revereArrayRecusrive(array, 0);
    printArray(array);
}


public static void revereArrayRecusrive(final String[] array, int startPointer) {
    if (startPointer >= (array.length / 2)) {
        return;
    }
    String temp = array[startPointer];
    array[startPointer] = array[array.length - 1 - startPointer];
    array[array.length - 1 - startPointer] = temp;
    revereArrayRecusrive(array, ++startPointer);
}

public static void printArray(final String[] array) {
    Arrays.stream(array).forEach(a -> System.out.print(a + " "));
    System.out.println();
}
}