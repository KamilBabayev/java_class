package less09.task03;

public class Subclass01 extends Parent{

    public void message() {
        System.out.println("This is first subclass");
    }

    @Override
    public void getName() {
        System.out.println("my name is subclass01");
    }
}
