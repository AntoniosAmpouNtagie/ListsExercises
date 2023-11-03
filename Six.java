package ListsExercises;

import java.util.ArrayList;
import java.util.Collections;

public class Six {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("world");
        ArrayList<String> newList = repeatList(stringArrayList, 5);
        System.out.println(newList);
    }

    public static ArrayList<String> repeatList(ArrayList<String> arrayList, int numRepeats) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i <= numRepeats; i++) {
            newList.addAll(arrayList);
        }
        Collections.sort(newList);
        return newList;
    }
}
