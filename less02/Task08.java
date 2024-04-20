package less02;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int mbDelimiter = 1024;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter data size in kilobytes");
        int kbVolume = scanner.nextInt();

        int kbRemainder = kbVolume % mbDelimiter;
        int mbPart = (kbVolume - kbRemainder) / mbDelimiter;

        System.out.println(kbVolume + " KB = " + mbPart + " MB and " + kbRemainder + " KB ");
    }
}
