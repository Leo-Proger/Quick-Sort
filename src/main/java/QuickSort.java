import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> array) {
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


        ArrayList<Integer> sortedLess = sort(less);
        sortedLess.add(pivot);

        ArrayList<Integer> sortedMore = sort(more);
        sortedLess.addAll(sortedMore);

        return sortedLess;
    }
}
