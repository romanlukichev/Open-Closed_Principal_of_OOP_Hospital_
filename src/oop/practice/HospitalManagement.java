package oop.practice;


/**
 * Created by Roman on 16.08.2016.
 */
public class HospitalManagement {
    // this class will call upon employees to do expected duties.
    // upper management should be able to order all kinds of employees to perform expected duties.


    public void callUpon(Employee employee){
        if(employee instanceof Nurse){
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        }

        if(employee instanceof Doctor){
            prescribeMedicine();
            diagnosePatiets();
        }

    }

    //Notice how violating single responsibility principle is making this class unreadable to look at? !!!!!!!!!!!!!

    // what kinds of behavior this class expect of conducting?

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
    //========================================================================================
    // Doctors
    private void prescribeMedicine(){
        System.out.println(" Prescribe Medicine ... ");
    }

    private void diagnosePatiets(){
        System.out.println(" Prescribe Medicine ... ");
    }

}
