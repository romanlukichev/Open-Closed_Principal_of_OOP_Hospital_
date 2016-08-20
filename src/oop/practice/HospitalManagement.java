package oop.practice;


/**
 * Created by Roman on 16.08.2016.
 */
public class HospitalManagement {
 public void callUpon(Employee employee){
     employee.performDuties();
 }
     // another approach
    // or we could have done employeeWork interface and add performDuties behavior there
    // and have all our employees implement that interface.


}
