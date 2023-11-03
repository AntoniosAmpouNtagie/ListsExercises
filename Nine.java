package ListsExercises;

import java.util.LinkedList;

public class Nine {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        rotateList(linkedList,3);
        System.out.println(linkedList);
    }
    public static void rotateList(LinkedList<Integer> linkedList,int numRotations){
        for (int i = 0; i < numRotations; i++) {
            Integer temp = linkedList.getFirst();
            linkedList.removeFirst();
            linkedList.addLast(temp);
        }
    }
}
