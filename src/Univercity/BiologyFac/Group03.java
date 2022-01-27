package Univercity.BiologyFac;

import java.util.ArrayList;
import java.util.Stack;

public class Group03 extends BioFacultets {
    int numberStudents = 3;
    String speciality = "genetics";
    Stack<StudentBiologyFacGroup03> listStudentsBiologyFacGroup03 = new Stack<>();
    public Stack<StudentBiologyFacGroup03> studentBiologyFacGroup03(){
        StudentBiologyFacGroup03 studentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Kadirov", 1.0, 0.1, 0.2);
        listStudentsBiologyFacGroup03.add(studentBiologyFacGroup03);
        StudentBiologyFacGroup03 secondStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan", 2.0, 0.1, 0.2);
        listStudentsBiologyFacGroup03.add(secondStudentBiologyFacGroup03);
        StudentBiologyFacGroup03 thirdStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan Zan", 3.0, 0.1, 0.2);
        listStudentsBiologyFacGroup03.add(thirdStudentBiologyFacGroup03);
        return listStudentsBiologyFacGroup03;
    }
}

