package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random_i = (int)Math.floor(Math.random()*(20-0+1)+0);
            cars.add(new Car(CarName.getRandomName(), CarColors.getRandomColor(), 200+random_i));
        }
        Car name = cars.stream().filter((s) -> s.color.equals(CarColors.RED))
                .max(Comparator.comparing(Car::getMaxSpeed)).get();
        System.out.println("index: "+ name);
        System.out.println("Name: "+name.name+"; Speed: "+name.maxSpeed+"km/h; Color: "+name.color);
        System.out.println("=".repeat(80));

        List<Student> students= new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            int random_a = (int)Math.floor(Math.random()*(19-15+1)+15);
            students.add(new Student(StudentName.getRandomStName(), StudentPatronym.getRandomStPatronym(),
                    StudentSurname.getRandomStSurname(), random_a, random_a-14, 0));
        }
        Student less16 = students.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(less16.surname);
        System.out.println("=".repeat(80));

        List<Student> students2 = new ArrayList<>();
        for (int k = 0; k < 100; k++) {
            int random_p = (int)Math.floor(Math.random()*(200-0+1)+0);
            int a = 18;//age
            int g = 5;//group
            students2.add(new Student(StudentName.getRandomStName(), StudentPatronym.getRandomStPatronym(),
                    StudentSurname.getRandomStSurname(), a, g, random_p));
        }
        Optional<Object> avarage = students2.stream().map(o->o.getPoints()).reduce((l1, l2)-> l1+l2).map(o->o/100.0);
        System.out.println(avarage);
        System.out.println("=".repeat(80));

        List<Employee> employee = students.stream().filter(st -> st.getAge() >=18)
                .map(student -> new Employee(student.getName(), student.getPatronym(),
                        student.getSurname(), student.getAge()))
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        System.out.println(employee);
    }
}
