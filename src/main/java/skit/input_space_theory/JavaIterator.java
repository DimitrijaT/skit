package skit.input_space_theory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {

    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Peugeot");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public List<String> commonElems(List<String> list1, List<String> list2) {
        if (list1 == null || list2 == null) {
            throw new NullPointerException("One or both of the lists is null.");
        }

        List<String> commonElements = new ArrayList<>();

        for (String element : list1) {
            if (list2.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }

    public static int numZero(int[] arr) {
        // Effects: If arr is null throw NullPointerException
        // else return the number of occurrences of 0 in arr
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }


}
