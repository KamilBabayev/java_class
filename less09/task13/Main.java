package less09.task13;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hr = new HRManager();

        hr.getSalary();
        hr.addEmployee();
        hr.work();

	// this is is issue

        employee.getSalary();
        employee.work();
    }
}
