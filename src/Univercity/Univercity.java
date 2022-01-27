package Univercity;

import Univercity.BiologyFac.StudentBiologyFacGroup01;
import Univercity.BiologyFac.StudentBiologyFacGroup02;
import Univercity.BiologyFac.StudentBiologyFacGroup03;
import Univercity.InternationalRelativeShipsFac.StudentInternationalRelativeShipsFacGroup01;
import Univercity.MehMatFac.StudentMehMatFacGroup01;
import Univercity.MehMatFac.StudentMehMatFacGroup02;
import Univercity.MehMatFac.StudentMehMatFacGroup03;
import Univercity.PhisFac.StudentPhisFacGroup01;
import Univercity.PhisFac.StudentPhisFacGroup02;
import Univercity.PhisFac.StudentPhisFacGroup03;

import java.util.Stack;

public class Univercity {
    String univercityName = "BGU";
    public double studentMathMark;
    public double studentForeignLanguageMark;
    public String facultetNameT;
    public String specialityT;
    public double averageScore(double mathMark, double foreignLanguageScore, double phisicalScore){
        return  (mathMark + foreignLanguageScore + phisicalScore)/3;
    }

    double mathTotalAverage(double mathTotalAverage, Stack<? extends Univercity> studentStack){
        return mathTotalAverage/studentStack.size();
    }

    double foreignLanguageTotalForThisGroup (Stack<Univercity> studentStack, String speciality, String facultetName){
        double numberStudentsThisGroup = 0;
        double totalForeignLanguageThisGroup = 0.0;
        for (Univercity univercity : studentStack){
            if (univercity.specialityT.equals(speciality) || univercity.facultetNameT.equals(facultetName)){
                numberStudentsThisGroup += 1.0;
                totalForeignLanguageThisGroup +=univercity.studentForeignLanguageMark;
            }
        }
        return totalForeignLanguageThisGroup/numberStudentsThisGroup;
    }

    public static void main(String[] args) {
        Stack<Univercity> studentsStack = new Stack<>();
        double studentAverageMark;
        Univercity univercity = new Univercity();

        StudentBiologyFacGroup03 studentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ivanov Ivan", 4.9, 9.0, 4.3);
        studentAverageMark = studentBiologyFacGroup03.averageScore(studentBiologyFacGroup03.getMathScore(), studentBiologyFacGroup03.getForeignLenguageScore(), studentBiologyFacGroup03.getPhisicalScore());
        System.out.printf("Total for Student" + "  :                     " + "%.2f", studentAverageMark);

        StudentBiologyFacGroup01 firstStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Korolev Serge", 3.7, 5.8, 10.3);
        studentsStack.push(firstStudentBiologyFacGroup01);
        StudentBiologyFacGroup01 secondStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Abukhovich Viktar", 4.4, 8.9, 7.6);
        studentsStack.push(secondStudentBiologyFacGroup01);
        StudentBiologyFacGroup01 thirdStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Eglit Viktar", 14.4, 108.9, 7.6);
        studentsStack.push(thirdStudentBiologyFacGroup01);
        StudentBiologyFacGroup02 firstStudentBiologyFacGroup02 = new StudentBiologyFacGroup02("Mahmud Abass", 33.4, 9.0, 0.3);
        studentsStack.push(firstStudentBiologyFacGroup02);
        StudentBiologyFacGroup02 secondStudentBiologyFacGroup02 = new StudentBiologyFacGroup02("Mahmud Cherces", 9.8, 2.0, 4.3);
        studentsStack.push(secondStudentBiologyFacGroup02);
        StudentBiologyFacGroup03 firststudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Kadirov", 1.0, 0.1, 0.2);
        studentsStack.add(firststudentBiologyFacGroup03);
        StudentBiologyFacGroup03 secondStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan", 2.0, 0.1, 0.2);
        studentsStack.add(secondStudentBiologyFacGroup03);
        StudentBiologyFacGroup03 thirdStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan Zan", 3.0, 0.1, 0.2);
        studentsStack.add(thirdStudentBiologyFacGroup03);
        StudentInternationalRelativeShipsFacGroup01 firstStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01 ("Koroleva Natasha", 3.7, 5.8, 10.3);
        studentsStack.push(firstStudentInternationalRelativeShipsFacGroup01);
        StudentInternationalRelativeShipsFacGroup01 secondStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01("Alegrova Viktar", 4.4, 8.9, 7.6);
        studentsStack.push(secondStudentInternationalRelativeShipsFacGroup01);
        StudentInternationalRelativeShipsFacGroup01 thirdStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01("Ovsienko Tatiyana", 14.4, 108.9, 7.6);
        studentsStack.push(thirdStudentInternationalRelativeShipsFacGroup01);
        StudentMehMatFacGroup01 firstStudentMehMatFacGroup01 = new StudentMehMatFacGroup01 ("Bulanova Tatiyana", 6.0, 1.8, 1.3);
        studentsStack.push(firstStudentMehMatFacGroup01);
        StudentMehMatFacGroup01 secondStudentMehMatFacGroup01 = new StudentMehMatFacGroup01("Shalimov Vadim", 4.9, 3.0, 8.2);
        studentsStack.push(secondStudentMehMatFacGroup01);
        StudentMehMatFacGroup01 thirdStudentMehMatFacGroup01 = new StudentMehMatFacGroup01("Onopko Viktar", 1.4, 10.9, 4.8);
        studentsStack.push(thirdStudentMehMatFacGroup01);
        StudentMehMatFacGroup02 firstStudentMehMatFacGroup02 = new StudentMehMatFacGroup02 ("Bulanova Tatiyana", 19.0, 10.8, 12.3);
        studentsStack.push(firstStudentMehMatFacGroup02);
        StudentMehMatFacGroup02 secondStudentMehMatFacGroup02 = new StudentMehMatFacGroup02("Bebeshko Vadim", 4.1, 4.0, 4.2);
        studentsStack.push(secondStudentMehMatFacGroup02);
        StudentMehMatFacGroup03 firstStudentMehMatFacGroup03 = new StudentMehMatFacGroup03 ("Bulan Buyan", 6.0, 1.8, 1.3);
        studentsStack.push(firstStudentMehMatFacGroup03);
        StudentMehMatFacGroup03 secondStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Shalimov Vadim", 4.9, 3.0, 8.2);
        studentsStack.push(secondStudentMehMatFacGroup03);
        StudentMehMatFacGroup03 thirdStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Onopko Viktar", 1.4, 10.9, 4.8);
        studentsStack.push(thirdStudentMehMatFacGroup03);
        StudentPhisFacGroup01 firstStudentPhisFacGroup01 = new StudentPhisFacGroup01("Ronaldo Tatiyana", 22.0, 111.8, 78.3);
        studentsStack.push(firstStudentPhisFacGroup01);
        StudentPhisFacGroup01 secondStudentPhisFacGroup01 = new StudentPhisFacGroup01("Becham Vadim", 48.9, 3.0, 8.2);
        studentsStack.push(secondStudentPhisFacGroup01);
        StudentPhisFacGroup01 thirdStudentPhisFacGroup01 = new StudentPhisFacGroup01("Rashford Viktar", 4.1, 10.9, 8.4);
        studentsStack.push(thirdStudentPhisFacGroup01);
        StudentPhisFacGroup02 firstStudentPhisFacGroup02 = new StudentPhisFacGroup02 ("Kostar-Valdau Ivan", 220, 1.8, 3.8);
        studentsStack.push(firstStudentPhisFacGroup02);
        StudentPhisFacGroup02 secondStudentPhisFacGroup02 = new StudentPhisFacGroup02("Hidi Lena", 8.0, 5.0, 4.1);
        studentsStack.push(secondStudentPhisFacGroup02);
        StudentPhisFacGroup02 thirdStudentPhisFacGroup02 = new StudentPhisFacGroup02("Rudgar Hauer", 4.1, 10.9, 8.4);
        studentsStack.push(thirdStudentPhisFacGroup02);
        StudentPhisFacGroup03 firstStudentPhisFacGroup03 = new StudentPhisFacGroup03 ("Messi Ibragim", 11.0, 55.9, 38.3);
        studentsStack.push(firstStudentPhisFacGroup03);
        StudentPhisFacGroup03 secondStudentPhisFacGroup03 = new StudentPhisFacGroup03("Becham Vadim", 0.9, 1.0, -8.2);
        studentsStack.push(secondStudentPhisFacGroup03);
        StudentPhisFacGroup03 thirdStudentPhisFacGroup03 = new StudentPhisFacGroup03("Rashford Viktar", 0.1, 10.9, 8.9);
        studentsStack.push(thirdStudentPhisFacGroup03);

        double mathTotalUnivercity = 0.0;
        for(Univercity thisStudent : studentsStack){
        mathTotalUnivercity += thisStudent.studentMathMark;
        }
        System.out.println();
        System.out.printf("Total Math For The Whole Univercity" + "  :  " + "%.2f", univercity.mathTotalAverage(mathTotalUnivercity, studentsStack));
        System.out.println();
        System.out.printf( "Total Foreign languadge score for any group" + "  :  " + "%.2f", univercity.foreignLanguageTotalForThisGroup(studentsStack, "Higher Algebra and information protection", "Meh-Mat facultet" ));




    }
}
