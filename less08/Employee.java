package less08;

import java.math.BigInteger;

public class Employee {
    private BigInteger salary;

    public void work() {
        System.out.println("running inside Employee class");
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }
}
