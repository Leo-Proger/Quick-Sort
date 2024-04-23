import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(
                5, 4, 6, 2, 1
        ));

        ArrayList<Integer> sortedArray = QuickSort.sort(array);
        System.out.println(sortedArray);
    }
}

