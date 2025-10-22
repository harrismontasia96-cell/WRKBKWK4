package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    public static void main(String[] args) {

    }


    private int employeeId;
    private String  name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;
    private double punchout;
    private int  starttime;
    private int  endtime;
    private int  punchTimeCard;
    private int  Totalpay;



    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double punchIn, double punchout, int  starttime, int endtime, int  punchTimeCard, int Totalpay) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchIn = punchIn;
        this.punchout = punchout;
        this.starttime = starttime;
        this.endtime = endtime;
        this.punchTimeCard  = punchTimeCard;
        this.Totalpay = Totalpay;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void PunchIn(double time) {
        this.punchIn = time;
        this.starttime = (int) time;
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();

         time = hour + (minute / 60.0);

        this.punchIn = time;
        this.starttime = hour * 60 + minute;
        System.out.println(name + " clocked in at " + hour + ":" + String.format("%02d", minute));


    }
    public void Punchout(double time) {
        this.punchout = time;
        this.endtime = (int) time;
        this.hoursWorked += (this.endtime - this.starttime);
        this.starttime = 0;

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();

         time = hour + (minute / 60.0);
        this.punchout = time;
        this.endtime = hour * 60 + minute;

        double workedMinutes = this.endtime - this.starttime;
        this.hoursWorked += workedMinutes / 60.0;

        System.out.println(name + " clocked out at " + hour + ":" + String.format("%02d", minute));



    }
    public int punchtimeCard() {
        return punchTimeCard;
    }

    public double getPunchIn() {
        return punchIn;
    }

    public double getPunchOut() {
        return punchout;
    }
    public int getPunchoutTime() {
        return punchTimeCard;
    }

    public double getstarttime() {
        return starttime;
    }
    public double getendtime() {
        return endtime;
    }
    public double getTotalPay() {
        return hoursWorked * payRate;
    }
    public void setTotalpay() {
        this.Totalpay = Totalpay;
    }

    public void setPunchIn(double punchIn) {
        this.punchIn = punchIn;
    }

    public void setPunchout(double punchout) {
        this.punchout = punchout;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
