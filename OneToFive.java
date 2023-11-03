package ListsExercises;


import java.util.ArrayList;
import java.util.Collections;

public class OneToFive {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
    }

    public static void sortList(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
    }
    public static ArrayList<Integer> copyList(ArrayList<Integer> arrayList){
        return new ArrayList<>(arrayList);
    }
    public static void shuffleList(ArrayList<Integer> arrayList){
        Collections.shuffle(arrayList);
    }
    public static void reverseList(ArrayList<Integer> arrayList){
        Collections.reverse(arrayList);
    }
    public static boolean compareList(ArrayList<Integer> arrayList,ArrayList<Integer> otherList){
        return arrayList.equals(otherList);
    }
}
