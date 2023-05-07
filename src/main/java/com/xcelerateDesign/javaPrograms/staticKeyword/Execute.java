package com.xcelerateDesign.javaPrograms.staticKeyword;

/**
 * The static keyword in Java is mainly used for memory management.
 * The static keyword in Java is used to share the same variable or method of a given class.
 * The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 * The static keyword is a non-access modifier in Java that is applicable for the following:
 * -Blocks
 * -Variables
 * -Methods
 * -Classes
 * Characteristics of static keyword:
 * -Shared memory allocation
 * -Accessible without object instantiation
 * -Associated with class, not objects
 * -Cannot access non-static members
 * -Can be overloaded, but not overridden
 * @author Xcelerate Design on 2023-05-09
 * @project java-programs
 */

public class Execute {

    public static void main(String[] args) {

        System.out.println(Student.getSchool());

        Student.setSchool("BAPS");
        System.out.println(Student.getSchool());

        Student s1 = new Student(1001, "Shiva",  'A', "Hyderabad");
        System.out.println(s1.getSchool());

        Student s2 = new Student(1002, "Mahesh",  'B', "Mumbai");
        s2.setSchool("BAPS");
        System.out.println(s2.getSchool());

        System.out.println(Student.getSchool());

    }

}
