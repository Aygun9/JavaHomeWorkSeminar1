package homeworkseminar4;

import java.util.LinkedList;
public class Task2 {
    public static void reverse(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move the indices towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);
        reverse(list);
        System.out.println("Reversed List: " + list);
    }
}

