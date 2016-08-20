package oop.practice;


/**
 * Created by Roman on 14.08.2016.
 */
public class Nurse extends Employee {
    public Nurse(boolean working, long id, String name, String department) {
        super(working, id, name, department);

        System.out.println("Nurse in action... "); // here println can be resolved.
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    //Nurses
    private void checkVitalSigns(){
        System.out.println("Checking Vital Signs ... ");
    }
    private void drawBlood(){
        System.out.println("Drawing Blood ... ");
    }

    private void cleanPatientArea(){
        System.out.println("Checking Vital Signs ... ");
    }
}

