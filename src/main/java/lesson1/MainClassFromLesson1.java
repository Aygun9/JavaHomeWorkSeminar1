package lesson1;

import java.util.Scanner;

public class MainClassFromLesson1 {
    public static void main(String[] args) {
       exeone();
     }

     private static void exeone(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your name");
         String name = scanner.nextLine();
         System.out.println(name);
     }
}


/*
System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println(name);
*/
