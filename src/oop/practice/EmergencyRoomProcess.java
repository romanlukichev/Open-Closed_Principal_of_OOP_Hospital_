package oop.practice;

/**
 * Created by Roman on 18.08.2016.
 */
public class EmergencyRoomProcess {
    public static void main(String args[]){
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(true,1,"Peggy","emergency");

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(true,2,"Suzan","emergency");

        ERDirector.callUpon(suzan);
    }
}
