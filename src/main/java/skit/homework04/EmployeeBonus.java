package skit.homework04;

public class EmployeeBonus {

    public EmployeeBonus() {
    }

    public boolean getsBonus(Employee employee) {
        System.out.println("This program tests if a company's employee will get bonus.");

        return employee.isSenior || (!employee.isPartTime && employee.monthsInCompany >= 6);
    }
}
