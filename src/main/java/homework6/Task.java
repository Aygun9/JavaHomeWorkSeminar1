package homework6;

import java.util.List;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Laptop ChuwiAH401 = new Laptop("Chuwi", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD");
        Laptop SamsungS101 = new Laptop("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        Laptop SamsungS150 = new Laptop("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        Laptop AsusTUF504 = new Laptop("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Laptop AsusTUF555 = new Laptop("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<Laptop> notebookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Choose argument for search, where:\n1 - by color\n2 - by brand");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Insert required color or brand : ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Laptop color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2) {
            for (Laptop brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Error.\nChoose argument for search, where:\n1 - by color\n2 - by brand");
        }

        scannerUser.close();

    }
}


