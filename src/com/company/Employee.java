package com.company;

public class Employee {
    private StudentName name;
    private StudentSurname surname;
    private StudentPatronym patronymic;
    private int age;

    public Employee(StudentName name, StudentPatronym patronymic, StudentSurname surname, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public StudentSurname getSurname() {
        return surname;
    }

    public void setSurname(StudentSurname surname) {
        this.surname = surname;
    }

    public StudentPatronym getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(StudentPatronym patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
