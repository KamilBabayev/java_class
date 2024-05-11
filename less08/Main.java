package less08;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        HRManager hr = new HRManager();
//
//        employee.work();
//        hr.work();
//        hr.AddEmployee();
//        hr.getSalary();


        CardService cardService = new CardService();
        cardService.doTransfer(BigDecimal.valueOf(100), "6127532323112121", "9927532323212121");
        cardService.doTransfer(BigDecimal.valueOf(200), "6127532323112121", "9927532323212121");

    }
}
