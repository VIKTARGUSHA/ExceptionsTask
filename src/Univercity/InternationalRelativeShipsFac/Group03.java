package Univercity.InternationalRelativeShipsFac;

import java.util.ArrayList;

public class Group03 extends InternationalRelativShipsFac {
    int numberStudents = 7;
    public String speciality = "Customs";
    ArrayList<StudentInternationalRelativeShipsFacGroup03> listStudentsInternationalRelativeShipsFacGroup03 = new ArrayList<>();
    StudentInternationalRelativeShipsFacGroup03 firstStudentInternationalRelativeShipsFacGroup03 = new StudentInternationalRelativeShipsFacGroup03 ("Michailov Stas", 12.7, 0.8, 7.3);
    StudentInternationalRelativeShipsFacGroup03 secondStudentInternationalRelativeShipsFacGroup03 = new StudentInternationalRelativeShipsFacGroup03("Kalina Viktar", 5.4, 7.9, 4.9);
    StudentInternationalRelativeShipsFacGroup03 thirdStudentInternationalRelativeShipsFacGroup03 = new StudentInternationalRelativeShipsFacGroup03("Babaian Roksana", 4.4, 8.9, 7.1);

    public ArrayList<StudentInternationalRelativeShipsFacGroup03> getListStudentsInternationalRelativeShipsFacGroup01FacGroup03 (){
        listStudentsInternationalRelativeShipsFacGroup03.add(firstStudentInternationalRelativeShipsFacGroup03);
        listStudentsInternationalRelativeShipsFacGroup03.add(secondStudentInternationalRelativeShipsFacGroup03);
        listStudentsInternationalRelativeShipsFacGroup03.add(thirdStudentInternationalRelativeShipsFacGroup03);
        return listStudentsInternationalRelativeShipsFacGroup03;
    }
}

