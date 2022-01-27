package Univercity.MehMatFac;

import java.util.ArrayList;

public class Group03 extends MehMatFacultet{
    int numberStudents = 7;
    String speciality = "Bio and Nano Mechanics";
    ArrayList<StudentMehMatFacGroup03> listStudentsMehMatFacGroup03 = new ArrayList<>();
    StudentMehMatFacGroup03 firstStudentMehMatFacGroup03 = new StudentMehMatFacGroup03 ("Bulan Buyan", 6.0, 1.8, 1.3);
    StudentMehMatFacGroup03 secondStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Shalimov Vadim", 4.9, 3.0, 8.2);
    StudentMehMatFacGroup03 thirdStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Onopko Viktar", 1.4, 10.9, 4.8);

    public ArrayList<StudentMehMatFacGroup03> studentsMehMatFacGroup03 (){
        listStudentsMehMatFacGroup03.add(firstStudentMehMatFacGroup03);
        listStudentsMehMatFacGroup03.add(secondStudentMehMatFacGroup03);
        listStudentsMehMatFacGroup03.add(thirdStudentMehMatFacGroup03);
        return listStudentsMehMatFacGroup03;
    }
}

