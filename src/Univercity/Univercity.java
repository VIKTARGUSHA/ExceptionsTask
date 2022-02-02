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
    public String studentMathMark;
    public String studentForeignLanguageMark;
    public String facultetName;
    public String speciality;
    public String mathScore, foreignLenguageScore, phisicalScore;
public String name;

    public double mathTotalAverage(Stack<? extends Univercity> studentStack) throws NoItemsException, NegativeAndAboveScoreException {
        double mathTotalUnivercity = 0.0;
        double numberOfStudents = studentStack.size();
        for (Univercity thisStudent : studentStack) {
            if (thisStudent.foreignLenguageScore == "None" && thisStudent.mathScore == "None" && thisStudent.phisicalScore == "None") {
                throw new NoItemsException(thisStudent.name, "This student doesn't has any subject");
            }
            if (thisStudent.phisicalScore != "None" && (Double.parseDouble(thisStudent.phisicalScore) < 0 || Double.parseDouble(thisStudent.phisicalScore) > 10) ){
                throw new NegativeAndAboveScoreException(thisStudent.name, "this Student has Phisical score out of range", thisStudent.phisicalScore);
            }
            if (thisStudent.mathScore != "None" && (Double.parseDouble(thisStudent.mathScore) < 0 || Double.parseDouble(thisStudent.mathScore) > 10)) {
                throw new NegativeAndAboveScoreException(thisStudent.name, "this Student has Math score out of range", thisStudent.mathScore);
            }
            if (thisStudent.foreignLenguageScore != "None" && (Double.parseDouble(thisStudent.foreignLenguageScore) < 0 || Double.parseDouble(thisStudent.foreignLenguageScore) > 10)) {
                throw new NegativeAndAboveScoreException(thisStudent.name, "this Student has foreignLenguage score out of range", thisStudent.foreignLenguageScore);
            }
            numberOfStudents -= thisStudent.mathScore == "None" ? 1.0 : 0.0;
            mathTotalUnivercity += thisStudent.mathScore == "None" ? 0.0 : Double.parseDouble(thisStudent.mathScore);
        }
            return mathTotalUnivercity / numberOfStudents;
    }

    double foreignLanguageTotalForThisGroup(Stack<Univercity> studentStack, String speciality, String facultetName) throws NoItemsException, NegativeAndAboveScoreException, CurrentGroupIsEmptyException {
        double numberStudentsThisGroup = 0;
        double totalForeignLanguageThisGroup = 0.0;
        for (Univercity univercity : studentStack) {
            if(univercity.speciality == speciality && univercity.facultetName == facultetName){
            if (univercity.foreignLenguageScore == "None" && univercity.mathScore == "None" && univercity.phisicalScore == "None") {
                throw new NoItemsException(univercity.name, "This student doesn't has any subject");
            }
            if (univercity.phisicalScore != "None" && (Double.parseDouble(univercity.phisicalScore) < 0 || Double.parseDouble(univercity.phisicalScore) > 10)) {
                throw new NegativeAndAboveScoreException(univercity.name, "this Student has Phisical score out of range", univercity.phisicalScore);
            }
            if (univercity.mathScore != "None" && (Double.parseDouble(univercity.mathScore) < 0 || Double.parseDouble(univercity.mathScore) > 10)) {
                throw new NegativeAndAboveScoreException(univercity.name, "this Student has Math score out of range", univercity.mathScore);
            }
            if (univercity.foreignLenguageScore != "None" && (Double.parseDouble(univercity.foreignLenguageScore) < 0 || Double.parseDouble(univercity.foreignLenguageScore) > 10)) {
                throw new NegativeAndAboveScoreException(univercity.name, "this Student has foreignLenguage score out of range", univercity.foreignLenguageScore);
            }

            if (univercity.foreignLenguageScore != "None" && (univercity.speciality == speciality && univercity.facultetName == facultetName)) {
                numberStudentsThisGroup += 1.0;
                totalForeignLanguageThisGroup += Double.parseDouble(univercity.studentForeignLanguageMark);
            }
        }
        }
        if (numberStudentsThisGroup == 0.0){
            throw new CurrentGroupIsEmptyException("This group is void :", speciality, facultetName);
        }
        return totalForeignLanguageThisGroup / numberStudentsThisGroup;
    }

    public double averageScoreForThisStudent(Univercity univercity) throws NoItemsException, NegativeAndAboveScoreException {
         double numberSabjects = 3.0;
        if (univercity.foreignLenguageScore == "None" && univercity.mathScore == "None" && univercity.phisicalScore == "None") {
            throw new NoItemsException(univercity.name, "This student doesn't has any subject");
        }
        if (univercity.phisicalScore != "None" && (Double.parseDouble(univercity.phisicalScore) < 0 || Double.parseDouble(univercity.phisicalScore) > 10)) {
            throw new NegativeAndAboveScoreException(univercity.name, "this Student has Phisical score out of range", univercity.phisicalScore);
        }
        if (univercity.mathScore != "None" && (Double.parseDouble(univercity.mathScore) < 0 || Double.parseDouble(univercity.mathScore) > 10)) {
            throw new NegativeAndAboveScoreException(univercity.name, "this Student has Math score out of range", univercity.mathScore);
        }
        if (univercity.foreignLenguageScore != "None" && (Double.parseDouble(univercity.foreignLenguageScore) < 0 || Double.parseDouble(univercity.foreignLenguageScore) > 10)) {
            throw new NegativeAndAboveScoreException(univercity.name, "this Student has foreignLenguage score out of range", univercity.foreignLenguageScore);
        }
        if (univercity.mathScore == "None"){numberSabjects -= 1.0;}
        if (univercity.phisicalScore == "None"){numberSabjects -= 1.0;}
        if (univercity.foreignLenguageScore == "None"){numberSabjects -= 1.0;}
            return ((univercity.mathScore == "None" ? 0.0 : Double.parseDouble(univercity.mathScore)) + (univercity.phisicalScore == "None" ? 0.0 : Double.parseDouble(univercity.phisicalScore)) + (univercity.studentForeignLanguageMark == "None" ? 0.0 : Double.parseDouble(univercity.studentForeignLanguageMark))) / numberSabjects;
        }

    public double averagePhisicalScoreForThisFacultet(Stack<? extends Univercity> stackAllTheStudents, String facName) throws NegativeAndAboveScoreException, NumberFormatException, NoItemsException {
        double sumScore = 0;
        double counter = 0;
        for (Univercity univercity : stackAllTheStudents) {
            if (univercity.facultetName == facName) {
                if (univercity.phisicalScore != "None" && (Double.parseDouble(univercity.phisicalScore) < 0 || Double.parseDouble(univercity.phisicalScore) > 10)) {
                    throw new NegativeAndAboveScoreException(univercity.name, "this Student has Phisical score out of range", univercity.phisicalScore);
                }
                if (univercity.mathScore != "None" && (Double.parseDouble(univercity.mathScore) < 0 || Double.parseDouble(univercity.mathScore) > 10)) {
                    throw new NegativeAndAboveScoreException(univercity.name, "this Student has Math score out of range", univercity.mathScore);
                }
                if (univercity.foreignLenguageScore != "None" && (Double.parseDouble(univercity.foreignLenguageScore) < 0 || Double.parseDouble(univercity.foreignLenguageScore) > 10)) {
                    throw new NegativeAndAboveScoreException(univercity.name, "this Student has foreignLenguage score out of range", univercity.foreignLenguageScore);
                }
                if (univercity.foreignLenguageScore == "None" && univercity.mathScore == "None" && univercity.phisicalScore == "None") {
                    throw new NoItemsException(univercity.name, "This student doesn't has any subject");
                }
                sumScore += (univercity.facultetName == facName) ? univercity.phisicalScore == "None" ? 0.0 : Double.parseDouble(univercity.phisicalScore) : 0.0;
                counter += (univercity.facultetName == facName && univercity.phisicalScore != "None") ? 1 : 0;
            }
        }
        return sumScore / counter;
    }


    public static void main(String[] args) {
        Stack<Univercity> studentsStack = new Stack<>();
        double studentAverageMark;
        Univercity univercity = new Univercity();
        StudentBiologyFacGroup01 firstStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Korolev Serge", "3.7", "5.8", "10.0");
        studentsStack.push(firstStudentBiologyFacGroup01);
        StudentBiologyFacGroup01 secondStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Abukhovich Viktar", "None", "1.2", "4.4");
        studentsStack.push(secondStudentBiologyFacGroup01);
        StudentBiologyFacGroup01 thirdStudentBiologyFacGroup01 = new StudentBiologyFacGroup01("Eglit Viktar", "4.0", "8.9", "7.6");
        studentsStack.push(thirdStudentBiologyFacGroup01);
        StudentBiologyFacGroup02 firstStudentBiologyFacGroup02 = new StudentBiologyFacGroup02("Mahmud Abass", "83.4", "9.0", "0.3");
        studentsStack.push(firstStudentBiologyFacGroup02);
        StudentBiologyFacGroup02 secondStudentBiologyFacGroup02 = new StudentBiologyFacGroup02("Mahmud Cherces", "9.8", "None", "4.3");
        studentsStack.push(secondStudentBiologyFacGroup02);
        StudentBiologyFacGroup03 firststudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Kadirov", "None", "3.0", "0.2");
        studentsStack.add(firststudentBiologyFacGroup03);
        StudentBiologyFacGroup03 secondStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan", "2.0", "None", "0.2");
        studentsStack.add(secondStudentBiologyFacGroup03);
        StudentBiologyFacGroup03 thirdStudentBiologyFacGroup03 = new StudentBiologyFacGroup03("Ramzan Zan Zan", "3.0", "7.0", "5.5");
        studentsStack.push(thirdStudentBiologyFacGroup03);
        StudentInternationalRelativeShipsFacGroup01 firstStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01("Koroleva Natasha", "3.7", "5.8", "0.3");
        studentsStack.push(firstStudentInternationalRelativeShipsFacGroup01);
        StudentInternationalRelativeShipsFacGroup01 secondStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01("Alegrova Viktar", "4.4", "8.9", "7.6");
        studentsStack.push(secondStudentInternationalRelativeShipsFacGroup01);
        StudentInternationalRelativeShipsFacGroup01 thirdStudentInternationalRelativeShipsFacGroup01 = new StudentInternationalRelativeShipsFacGroup01("Ovsienko Tatiyana", "1.4", "10.0", "7.6");
        studentsStack.push(thirdStudentInternationalRelativeShipsFacGroup01);
        StudentMehMatFacGroup01 firstStudentMehMatFacGroup01 = new StudentMehMatFacGroup01("Bulanova Tatiyana", "6.0", "1.8", "1.3");
        studentsStack.push(firstStudentMehMatFacGroup01);
        StudentMehMatFacGroup01 secondStudentMehMatFacGroup01 = new StudentMehMatFacGroup01("Shalimov Vadim", "4.9", "3.0", "8.2");
        studentsStack.push(secondStudentMehMatFacGroup01);
        StudentMehMatFacGroup01 thirdStudentMehMatFacGroup01 = new StudentMehMatFacGroup01("Onopko Viktar", "1.4", "7.9", "4.8");
        studentsStack.push(thirdStudentMehMatFacGroup01);
        StudentMehMatFacGroup02 firstStudentMehMatFacGroup02 = new StudentMehMatFacGroup02("Bulanova Tatiyana", "9.0", "8.8", "5.3");
        studentsStack.push(firstStudentMehMatFacGroup02);
        StudentMehMatFacGroup02 secondStudentMehMatFacGroup02 = new StudentMehMatFacGroup02("Bebeshko Vadim", "4.1", "4.0", "4.2");
        studentsStack.push(secondStudentMehMatFacGroup02);
        StudentMehMatFacGroup03 firstStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Bulan Buyan", "None", "None", "None");
        studentsStack.push(firstStudentMehMatFacGroup03);
        StudentMehMatFacGroup03 secondStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Shalimov Vadim", "4.9", "3.0", "-8.2");
        studentsStack.push(secondStudentMehMatFacGroup03);
        StudentMehMatFacGroup03 thirdStudentMehMatFacGroup03 = new StudentMehMatFacGroup03("Onopko Viktar", "1.4", "9.9", "7.8");
        studentsStack.push(thirdStudentMehMatFacGroup03);
        StudentPhisFacGroup01 firstStudentPhisFacGroup01 = new StudentPhisFacGroup01("Ronaldo Tatiyana", "2.0", "1.8", "7.3");
        studentsStack.push(firstStudentPhisFacGroup01);
        StudentPhisFacGroup01 secondStudentPhisFacGroup01 = new StudentPhisFacGroup01("Becham Vadim", "8.9", "3.0", "8.2");
        studentsStack.push(secondStudentPhisFacGroup01);
        StudentPhisFacGroup01 thirdStudentPhisFacGroup01 = new StudentPhisFacGroup01("Rashford Viktar", "4.1", "0.0", "8.4");
        studentsStack.push(thirdStudentPhisFacGroup01);
        StudentPhisFacGroup02 firstStudentPhisFacGroup02 = new StudentPhisFacGroup02("Kostar-Valdau Ivan", "None", "2.3", "None");
        studentsStack.push(firstStudentPhisFacGroup02);
        StudentPhisFacGroup02 secondStudentPhisFacGroup02 = new StudentPhisFacGroup02("Hidi Lena", "8.0", "5.0", "None");
        studentsStack.push(secondStudentPhisFacGroup02);
        StudentPhisFacGroup02 thirdStudentPhisFacGroup02 = new StudentPhisFacGroup02("Rudgar Hauer", "4.1", "3.9", "8.4");
        studentsStack.push(thirdStudentPhisFacGroup02);
        StudentPhisFacGroup03 firstStudentPhisFacGroup03 = new StudentPhisFacGroup03("Messi Ibragim", "9.0", "5.9", "3.3");
        studentsStack.push(firstStudentPhisFacGroup03);
        StudentPhisFacGroup03 secondStudentPhisFacGroup03 = new StudentPhisFacGroup03("Becham Vadim", "0.9", "-1.0", "8.2");
        studentsStack.push(secondStudentPhisFacGroup03);
        StudentPhisFacGroup03 thirdStudentPhisFacGroup03 = new StudentPhisFacGroup03("Rashford Viktar","0", "0.9", "8.9");
        studentsStack.push(thirdStudentPhisFacGroup03);

        try {
        System.out.printf("Total Math For The Whole Univercity" + "  :  " + "%.2f", univercity.mathTotalAverage(studentsStack));
        }catch (NoItemsException ex) {
        }catch (NegativeAndAboveScoreException e){
        }
        System.out.println();

        try {
            System.out.printf("Total Foreign language score for any group" + "  :  " + "%.2f", univercity.foreignLanguageTotalForThisGroup(studentsStack, "International Tourism", "InternationalRelativeShips facultet"));
        }catch (NoItemsException ex){
        }
        catch (NegativeAndAboveScoreException e) {
        }
        catch (CurrentGroupIsEmptyException e){
        }
        System.out.println();

        try {
            System.out.printf("Average Score for this Student" + "  :           " + "%.2f", univercity.averageScoreForThisStudent(firstStudentMehMatFacGroup03));
        }catch (NegativeAndAboveScoreException e){
        }catch (NoItemsException ex){
        }
        System.out.println();

        try {
            System.out.printf("Average Phisical Score for this Facultet" + "  :  " + "%.2f", univercity.averagePhisicalScoreForThisFacultet(studentsStack, "Phisical facultet"));
        } catch (NegativeAndAboveScoreException ex){
        }
        catch (NoItemsException e) {
            System.out.println();
        }
    }
}