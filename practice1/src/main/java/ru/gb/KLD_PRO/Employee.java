package ru.gb.KLD_PRO;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
