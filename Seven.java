package ListsExercises;

import java.util.ArrayList;

public class Seven {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(5);
        integerArrayList.add(8);
        integerArrayList.add(9);
        System.out.println(consecutiveList(integerArrayList));
    }
    public static boolean consecutiveList(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i+1))){
                return true;
            }
        }
        return false;
    }
}
