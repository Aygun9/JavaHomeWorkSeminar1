package homeworkseminar4;
import java.util.ArrayList;
import java.util.Scanner;
public class Task1 {

        private final ArrayList<String> stringList = new ArrayList<String>();

        public void addString(String input) {
        stringList.add(input);
    }

        public void printStrings() {
        if (stringList.isEmpty()) {
            System.out.println("No strings have been entered.");
        } else {
            System.out.println("Printed Strings:");
            for (int i = stringList.size() - 1; i >= 0; i--) {
                System.out.println(stringList.get(i));
            }
        }
    }

        public void revertString() {
        if (stringList.isEmpty()) {
            System.out.println("No strings have been entered.");
        } else {
            System.out.println("Reverted String:");
            stringList.remove(stringList.size() - 1);
        }
    }

        public static void main(String[] args) {
        Task1 stringMemory = new Task1();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Enter a string, 'print', or 'revert':");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                stringMemory.printStrings();
            } else if (input.equalsIgnoreCase("revert")) {
                stringMemory.revertString();
            } else {
                stringMemory.addString(input);
            }
        }
    }
}
