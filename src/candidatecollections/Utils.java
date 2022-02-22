/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author LuCiFer
 */
public class Utils {
    public static String getString(String message) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(message);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty()) {
                result = tmp;
                check = false;
            }
        } while (check);
        return result;
    }

    public static int getInt(String message) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            try {
                System.out.print(message);
                result = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.print("Error! Integer number: ");
            }
        } while (check);
        return result;
    }

    public static String updateString(String oldValue, String message) {
        String result = oldValue;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }

    public static void printMenu() {
        System.out.println("1. Add Experience");
        System.out.println("2. Add Intern");
        System.out.println("3. Find Candidate by ID");
        System.out.println("4. Find Candidate by Index");
        System.out.println("5. Update by ID");
        System.out.println("6. Update by Index");
        System.out.println("7. Remove by ID");
        System.out.println("8. Update by Index");
        System.out.println("9. Display Experience");
        System.out.println("10. Display Intern");
        System.out.println("11. Display All");
        System.out.println("12. Quit");

    }
}
