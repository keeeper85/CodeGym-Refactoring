package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class University {

    private List<Student> students = new ArrayList<>();

    private String name;
    private int age;



    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        // TODO:
        Student student;

        for (Student value : students){
            if (value.getAverageGrade() == averageGrade) {
                student = value;
                return student;
            }
        }


        return null;
    }

    public Student getStudentWithHighestAverageGrade() {
        // TODO:

        TreeMap<Double, Student> map = new TreeMap<>();

        for (Student value : students){
            map.put(value.getAverageGrade(), value);
        }

        Student student = new Student("xx", 1, 1);

        for (Map.Entry<Double, Student> pair : map.entrySet()){
            student = pair.getValue();
        }

        return student;
    }

    public Student getStudentWithLowestAverageGrade() {
        // TODO:

        TreeMap<Double, Student> map = new TreeMap<>();

        for (Student value : students){
            map.put(value.getAverageGrade(), value);
        }

        Student student = new Student("xx", 1, 1);

        for (Map.Entry<Double, Student> pair : map.entrySet()){
            student = pair.getValue();
            break;
        }

        return student;
    }

    public void expel(Student student){
        students.remove(student);
    }



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}