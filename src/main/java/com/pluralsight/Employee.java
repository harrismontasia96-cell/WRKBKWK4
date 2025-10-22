package com.pluralsight;

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

    }
    public void Punchout(double time) {
        this.punchout = time;
        this.endtime = (int) time;
        this.hoursWorked += (this.endtime - this.starttime);
        this.starttime = 0;
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
    public int getTotalPay() {
        return Totalpay;
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
