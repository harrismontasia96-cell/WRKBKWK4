package com.pluralsight;


import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Employee montasia = new Employee(1, "montasia", "HR", 40.50, 0,8.0, 18.0, 8, 17.0, 1234);

        montasia.PunchIn(6.00);
        montasia.Punchout(10.00);

        System.out.println("Employee: " + montasia.getEmployeeId());
        System.out.println("Department: " + montasia.getDepartment());
        System.out.println("Pay Rate: $" + montasia.getPayRate());
        System.out.println("Punch Card #: " + montasia.punchtimeCard());
        System.out.println("hoursWorked: " + montasia.getHoursWorked());
        System.out.println("Total Pay: $" + montasia.getTotalPay());


    }
}




