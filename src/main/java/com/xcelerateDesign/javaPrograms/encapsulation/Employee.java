package com.xcelerateDesign.javaPrograms.encapsulation;

/**
 * Encapsulation, is to make sure that 'sensitive' data is hidden from users.
 * To achieve this, we must declare class variables/attributes as private
 * provide public get and set methods to access and update the value of a private variable
 * @author Xcelerate Design on 2023-05-07
 * @project java-programs
 */

public class Employee {

    private int salary;
    private static final int MAX_SALARY = 20000;
    private static final int MIN_SALARY = 0;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 20000) {
            this.salary = MAX_SALARY;
        } else if (salary < 0) {
            this.salary = MIN_SALARY;
        } else {
            this.salary = salary;
        }
    }

}
