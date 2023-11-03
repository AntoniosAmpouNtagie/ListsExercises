package ListsExercises;

import java.util.ArrayList;

public class Eight {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("beautiful");
        stringArrayList.add("world");
        shiftList(stringArrayList);
        System.out.println(stringArrayList);
    }
    public static void shiftList(ArrayList<String> arrayList){
        String temp = arrayList.getFirst();
        arrayList.removeFirst();
        arrayList.addLast(temp);
    }
}
