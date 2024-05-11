package less08;

public class HRManager extends Employee{


    public static void main(String[] args) {
        System.out.println("ok");
    }

    @Override
    public void work() {
        System.out.println("running inside HRManager class");
    }

    public void AddEmployee() {
        System.out.println("HR manager adds new employee");
    }


}
