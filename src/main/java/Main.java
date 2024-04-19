import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(5);
        array.add(3);
        array.add(4);
        array.add(1);

        ArrayList<Integer> sortedArray = sortArray(array);
        System.out.println(sortedArray);
    }

    private static ArrayList<Integer> sortArray(ArrayList<Integer> array) {
        if (array.size() < 2) return array;
        else if (array.size() == 2) {
            ArrayList<Integer> tmp = new ArrayList<>();

            tmp.add(Collections.min(array));
            tmp.add(Collections.max(array));

            return tmp;
        }

        int pivot = array.get(array.size() / 2);

        ArrayList<Integer> less = new ArrayList<>();
        for (int el : array)
            if (el < pivot)
                less.add(el);

        ArrayList<Integer> more = new ArrayList<>();
        for (int el : array)
            if (el > pivot)
                more.add(el);


        ArrayList<Integer> sortedLess = sortArray(less);
        sortedLess.add(pivot);

        ArrayList<Integer> sortedMore = sortArray(more);
        sortedLess.addAll(sortedMore);

        return sortedLess;
    }
}

