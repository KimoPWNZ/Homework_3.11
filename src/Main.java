import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования MyArrays
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println("Index of 3: " + MyArrays.binarySearch(byteArray, (byte) 3)); // выведет 2
        System.out.println("Index of 6: " + MyArrays.binarySearch(byteArray, (byte) 6)); // выведет -6

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Index of c: " + MyArrays.binarySearch(charArray, 'c')); // выведет 2

        // Пример использования MyCollections
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        System.out.println("Index of Banana: " + MyCollections.binarySearch(list, "Banana")); // выведет 1
        System.out.println("Index of Grape: " + MyCollections.binarySearch(list, "Grape")); // выведет -4

        // Пример использования с Comparator
        Comparator<String> comparator = Comparator.naturalOrder();
        System.out.println("Index of Cherry with Comparator: " +
                MyCollections.binarySearch(list, "Cherry", comparator)); // выведет 2
    }
}