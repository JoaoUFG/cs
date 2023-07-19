package org.example._04;

public class Employee {

    double salary;

    double awards;
    public void employeeMethod(Employee employee) {
        // Some actions
        double yearlySalary = employee.getYearlySalary();
        double awards = employee.getAwards();
        double monthlySalary = getMonthlySalary(yearlySalary, awards);
        // Continue processing
    }

    public double getYearlySalary(){
        return salary*12;
    }

    public double getAwards(){
        return awards;
    }

    public double getMonthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards)/12;
    }
}
