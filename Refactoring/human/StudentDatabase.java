package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    public static List<Student> students = new ArrayList<>();



    public static void addStudentInfo(Student student) {
        //Student student1 = new Student(student.getName(), student.getAge(), student.getAverageGrade());
        students.add(student);
        printStudentInfo(student);

    }

    public static void printStudentInfo(Student student) {
        System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    }

    public static void removeStudent(int index) {

        int i = 0;

        for (Student value : students){
            if (i == index){
                students.remove(index);
                break;
            }
            i++;
    }
    }

    public static void findJohnOrAlex() {

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().equals("John") || (students.get(i).getName().equals("Alex"))) {
                    System.out.println(students.get(i).getName() + " is in the student database.");
                    break;
                }

            }
//            if (!found) {
//                if (students.get(i).getName().equals("John")) {
//                    System.out.println("John is in the student database.");
//                    found = true;
//                }
//
//                if (students.get(i).getName().equals("Alex")) {
//                    System.out.println("Alex is in the student database.");
//                    found = true;
//                }
//            }
        }
    }
