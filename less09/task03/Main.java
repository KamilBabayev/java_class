package less09.task03;

public class Main {
    public static void main(String[] args) {

        Subclass01 sub01 = new Subclass01();
        Subclass02 sub02 = new Subclass02();

        sub01.message();
        sub02.message();
        System.out.println(" ");
        sub01.getName();
        sub02.getName();
    }
}
