package com.company;

public class Student {
    StudentName name;
    StudentPatronym patronym;
    StudentSurname surname;
    int age;
    int group;
    int points;

    public Student(StudentName name, StudentPatronym patronym,
                   StudentSurname surname, int age, int group, int points) {
        this.name = name;
        this.patronym = patronym;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.points=points;
    }

    public int getAge() {
        return age;
    }

    public StudentName getName() {
        return name;
    }

    public StudentPatronym getPatronym() {
        return patronym;
    }

    public StudentSurname getSurname() {
        return surname;
    }

    public int getGroup() {
        return group;
    }

    public int getPoints() {
        return points;
    }
}
