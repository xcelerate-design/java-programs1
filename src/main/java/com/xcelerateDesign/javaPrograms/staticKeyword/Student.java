package com.xcelerateDesign.javaPrograms.staticKeyword;

/**
 * @author Xcelerate Design on 2023-05-09
 * @project java-programs
 */

public class Student {

    private int id;
    private String name;
    private static String school;
    private char grade;
    private String city;

    static {
        school = "SMVS";
        System.out.println("I am in static block");
    }

    public Student(int id, String name, char grade, String city) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
