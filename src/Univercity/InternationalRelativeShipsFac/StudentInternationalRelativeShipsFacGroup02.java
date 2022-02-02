package Univercity.InternationalRelativeShipsFac;

import Univercity.MehMatFac.MehMatFacultet;

public class StudentInternationalRelativeShipsFacGroup02 extends Group02 {

    public StudentInternationalRelativeShipsFacGroup02(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){

        name = namee;
        mathScore = mathScores;
        this.foreignLenguageScore = foreignLenguageScore;
        phisicalScore = phisicalScores;
        studentMathMark = mathScore;
        studentForeignLanguageMark = foreignLenguageScore;
    }
    public String toString(){
        return (name + " " + speciality + " " + facultetName + " " + mathScore + " " + foreignLenguageScore + " " + phisicalScore);
    }
}
