package oop.practice;

/**
 * Created by Roman on 16.08.2016.
 */
public class Doctor extends Employee{
    public Doctor(boolean working, long id, String name, String department) {
        super(working, id, name, department);
        System.out.println("Doctor in action...");
    }
    // this is called a Strategy design pattern
    // this pattern allows algorythm behavior to be selected at runtime
    private void prescribeMedicine(){
        System.out.println(" Prescribe Medicine ... ");
    }

    private void diagnosePatiets(){
        System.out.println(" Prescribe Medicine ... ");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatiets();
    }
}

