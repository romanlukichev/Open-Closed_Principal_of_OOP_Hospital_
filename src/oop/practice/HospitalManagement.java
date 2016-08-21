package oop.practice;


/**
 * Created by Roman on 16.08.2016.
 */
public class HospitalManagement {
 public void callUpon(Employee employee){
     employee.performDuties();
     // hospital management does not know the details of what the doctor does or the nurse does.
     // their behavor is defined in hteir own class defenitions.

     // this is called a Strategy design pattern
     // this pattern allows algorythm behavior to be selected at runtime
     //
 }
     // another approach
    // or we could have done employeeWork interface and add performDuties behavior there
    // and have all our employees implement that interface.


}
