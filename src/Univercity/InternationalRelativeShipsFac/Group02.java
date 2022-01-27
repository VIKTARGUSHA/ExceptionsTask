package Univercity.InternationalRelativeShipsFac;

import java.util.ArrayList;

public class Group02 extends InternationalRelativShipsFac {
    int numberStudents = 2;
    public String speciality = "International Tourism";
    ArrayList<StudentInternationalRelativeShipsFacGroup02> listStudentsInternationalRelativeShipsFacGroup02 = new ArrayList<>();
    StudentInternationalRelativeShipsFacGroup02 firstStudentInternationalRelativeShipsFacGroup02 = new StudentInternationalRelativeShipsFacGroup02 ("Oleg Gazmanov", 5.7, 11.8, 0.3);
    StudentInternationalRelativeShipsFacGroup02 secondStudentInternationalRelativeShipsFacGroup02 = new StudentInternationalRelativeShipsFacGroup02("Serov Dima", 1.4, 3.9, 7.7);
    StudentInternationalRelativeShipsFacGroup02 thirdStudentInternationalRelativeShipsFacGroup02 = new StudentInternationalRelativeShipsFacGroup02("Soltikov Igor", 14.4, 9.9, 4.5);

    public ArrayList<StudentInternationalRelativeShipsFacGroup02> getListStudentsInternationalRelativeShipsFacGroup01FacGroup02 (){
        listStudentsInternationalRelativeShipsFacGroup02.add(firstStudentInternationalRelativeShipsFacGroup02);
        listStudentsInternationalRelativeShipsFacGroup02.add(secondStudentInternationalRelativeShipsFacGroup02);
        listStudentsInternationalRelativeShipsFacGroup02.add(thirdStudentInternationalRelativeShipsFacGroup02);
        return listStudentsInternationalRelativeShipsFacGroup02;
    }
}

