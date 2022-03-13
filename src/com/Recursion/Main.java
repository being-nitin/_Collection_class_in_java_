package com.Recursion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	// Collection class:
        List <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(21);
        list.add(26);
        list.add(26);
        list.add(56);
        list.add(15);

        // for min element
        System.out.println(Collections.min(list));

        // for max element
        System.out.println(Collections.max(list));

        // will print the no of times a particular element is present.
        System.out.println(Collections.frequency(list,26));

        // to sort the list in ascending order;
        Collections.sort(list);

        // to sort the list in descending order.
        Collections.sort(list, Comparator.reverseOrder());
    }
}