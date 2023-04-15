package homeworkseminar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Task1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Harry Potter");
        nameBook.put(1, "Hermione Granger ");
        nameBook.put(2, "Severus Snape.");
        nameBook.put(3, "Volandemort ");
        for (int i=0;i< nameBook.size();i++){
            if (phoneBook.get(i)==null){
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("994-538-69-00-"+i+i+";"+"994-317-755-00-"+i+i);
            }
            System.out.println("Phone numbers of "+" "+nameBook.get(i)+" :"+phoneBook.get(i));
        }

    }

}
