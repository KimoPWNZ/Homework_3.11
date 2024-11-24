import java.util.Comparator;
import java.util.List;

public class MyCollections {

    // Бинарный поиск для списка объектов
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, 0, list.size() - 1);
    }

    private static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key, int fromIndex, int toIndex) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = list.get(mid).compareTo(key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid - 1;
            } else {
                return mid; // Найденный элемент
            }
        }
        return -(fromIndex + 1);
    }

    // Бинарный поиск для списка с использованием Comparator
    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, key, c, 0, list.size() - 1);
    }

    private static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c, int fromIndex, int toIndex) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(list.get(mid), key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid - 1;
            } else {
                return mid; // Найденный элемент
            }
        }
        return -(fromIndex + 1);
    }
}