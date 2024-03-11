package Ex06;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String Gender;
    private double rate;
    private double Salary;
    public Employee(){}

    public Employee(int employeeId, String employeeName, int age, String gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        Gender = gender;
        this.rate = rate;
        Salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public String isGender() {
        return Gender;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setEmployeeId(int emloyeeId) {
        this.employeeId = emloyeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void inputData(Scanner scanner){
        System.out.println("mời bạn nhập mã nhân viên");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên nhân viên");
        this.employeeName = scanner.nextLine();
        System.out.println("mời bạn nhập tuổi nhân viên");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập giới tính nhân viên");
        this.Gender = scanner.nextLine();
        System.out.println("mời bạn nhập hệ số lương");
        this.rate = Double.parseDouble(scanner.nextLine());
        this.Salary = Double.parseDouble(scanner.nextLine());
    }
    public double calSalary(){
        return this.rate * 1300000;
    }
    public void displayData(){
        System.out.println("Ex06.Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gen='" + Gender + '\'' +
                ", rate=" + rate +
                ", salary=" + Salary +
                '}');
    }

}
