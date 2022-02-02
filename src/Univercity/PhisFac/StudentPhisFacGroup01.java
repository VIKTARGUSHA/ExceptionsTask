package Univercity.PhisFac;

import Univercity.MehMatFac.MehMatFacultet;

public class StudentPhisFacGroup01 extends Group01 {


    public StudentPhisFacGroup01(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){
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
