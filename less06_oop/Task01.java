package less06_oop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        User[] users = new User[1];
        int index = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter next action:  1. exit 2. new 3. showuser  4.update ");
            String action = scanner.nextLine();

            switch (action) {
                case "new" -> {
                    System.out.println("enter user name: ");
                    String name = scanner.nextLine();

                    System.out.println("enter user surname: ");
                    String surname = scanner.nextLine();

                    System.out.println("enter user age: ");
                    int age = scanner.nextInt();

                    scanner = new Scanner(System.in);
                    System.out.println("enter user postion: ");
                    String position = scanner.nextLine();

                    scanner = new Scanner(System.in);
                    System.out.println("enter user address: ");
                    String address = scanner.nextLine();

                    User user01 = createNewUser(name, surname, age, position, address);
                    users[index] = user01;
                    index++;
                }
                case "showuser" -> {
                    getUserbyName(users, "kamil");
                }
                case "update" -> {
                    System.out.println("welcoe");
                    updateUserInfo(users, "kamil");

                }
                case "exit" -> {
                    System.out.println("exiting");
                    for (int i = 0; i < users.length; i++) {
                        System.out.println(users[i]);
                    }
                    System.exit(0);
                }
            }
        }
    }

    public static String showUserInfo(User user) {
        return  "Name: " + user.getName() + " \n" +
                "Sname: " + user.getSurname() + "\n" +
                "Age " + user.getAge() + "\n" +
                "Position " + user.getPosition() + "\n" +
                "Address " + user.getAddress();
    }

    public static User createNewUser(String name, String surname, int age, String position, String address) {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);
        user.setPosition(position);
        user.setAddress(address);

        return user;
    }

    public static void getUserbyName(User[] users, String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                System.out.println(users[i].getName());
                System.out.println(users[i].getSurname());
                System.out.println(users[i].getAge());
                System.out.println(users[i].getPosition());
                System.out.println(users[i].getAddress());
            }
        }
    }

    public static void updateUserInfo(User[] users, String name) {
        System.out.println("enter new name to update: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                System.out.println(users[i].getName());
                users[i].setName("Updated user");
                System.out.println("updated name" + " " + users[i].getName());
            }
        }
    }
}

