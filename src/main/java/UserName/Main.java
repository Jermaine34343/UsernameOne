package UserName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Alice")) {
                System.out.println("Welcome " + name);
                break;
            } else if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome " + name);
                break;
            } else {
                System.out.println("Wrong name try again!");
            }
        }
    }
}