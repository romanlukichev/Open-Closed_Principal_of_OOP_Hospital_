package oop.practice;

/**
 * Created by Roman on 16.08.2016.
 */
public class Doctor extends Employee{
    public Doctor(boolean working, long id, String name, String department) {
        super(working, id, name, department);
        System.out.println("Doctor in action...");
    }
}

