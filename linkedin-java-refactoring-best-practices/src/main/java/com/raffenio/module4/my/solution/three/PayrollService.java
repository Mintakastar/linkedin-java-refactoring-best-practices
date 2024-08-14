package com.raffenio.module4.my.solution.three;

public class PayrollService implements PayrollProcessor{

    private EmployeeService employeeService;
    private TaxCalculator taxCalculator;

    public PayrollService(/**/){
        //set all instanciated services here
    }

    public void calculateSalaries() {
        // load employee data
        Payroll payroll = new Payroll();
        payroll.setEmployees(employeeService.getEmployees());

        // calculate gross pay for each employee
        this.calculateGrossPayment(payroll );

        // calculate taxes for each employee
        taxCalculator.calculateTax(payroll);

        // calculate net pay for each employee

        // generate pay stubs for each employee

        // save payroll data
        this.save();
    }


    public void save(){

    }

    public void calculateGrossPayment(Payroll payroll ){

    }
}
