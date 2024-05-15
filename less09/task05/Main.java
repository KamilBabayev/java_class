package less09.task05;

public class Main {
    public static void main(String[] args) {
        int[] marksA = {100, 90, 70};
        int[] marksB = {60, 80, 70, 90};

        StudentA studentA = new StudentA(marksA);
        StudentB studentB = new StudentB(marksB);

        System.out.println("student A percentage: " + studentA.getPercentage(marksA));
        System.out.println("student B percentage: " + studentB.getPercentage(marksB));
    }
}
