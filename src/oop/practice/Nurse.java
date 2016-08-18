package oop.practice;


/**
 * Created by Roman on 14.08.2016.
 */
public class Nurse extends Employee {
    public Nurse(boolean working, long id, String name, String department) {
        super(working, id, name, department);

        System.out.println("Nurse in action... "); // here println can be resolved.
    }


}

