package less12;

import java.util.Scanner;

public class Main {
    public static String USERNAME = "admin";
    public static String PASSWORD = "admin123";

    public static void main(String[] args)  {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter username: ");
//        String username = scanner.nextLine();
//        System.out.println("enter password");
//        String password = scanner.nextLine();
//
//
//
//        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
//            System.out.println("Login is successfull");
//        } else {
//            throw new LoginExceptions("invalid credentials");
//        }

//        getInteger();
        vowelsChecker();
    }

    public static void getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is " + number);
        } else {
            throw new OddNumberException("number is ODD");
        }
    }

    public static void vowelsChecker() {
        String[] vowels = {"a", "i"};
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < vowels.length; i++) {
            if (text.contains(vowels[i])) {
                count++;
            }
        }

        System.out.println(count);
        if (count == 0) {
            throw new VowelsException("no vowel found");
        }

        }
}
