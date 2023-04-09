package homeworkseminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

    public class Task2 {
        public static void main(String[] args) {
            Random rndNumb = new Random();
            int capacity = 20;
            int minNumb,maxNumb;
            float averNumb=0;
            ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
            for (int i = 0; i < capacity; i++) {
                listNumb.add(rndNumb.nextInt(100));
                averNumb=averNumb+listNumb.get(i);
            }
            System.out.println("Initial list: ");
            System.out.println(listNumb);
            Collections.sort(listNumb);
            System.out.println("Sorted list: ");
            System.out.println(listNumb);
            minNumb=listNumb.get(0);
            maxNumb=listNumb.get(capacity-1);
            averNumb=averNumb/capacity;
            System.out.println("Minimal element from the list  = "+minNumb);
            System.out.println("Maximum element from the list = "+maxNumb);
            System.out.println("Average from the list  = "+averNumb);
        }
    }

