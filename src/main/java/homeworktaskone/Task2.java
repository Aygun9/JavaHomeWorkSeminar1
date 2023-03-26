package homeworktaskone;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == val) { // Если элемент равен заданному значению, то меняем его с последним элементом в массиве
                nums[start] = nums[end];
                end--;
            } else { // Иначе, перемещаем его в начало массива
                start++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
