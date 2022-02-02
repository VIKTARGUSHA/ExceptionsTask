package Univercity.BiologyFac;

import Univercity.MehMatFac.MehMatFacultet;
import Univercity.Univercity;

public class StudentBiologyFacGroup01 extends Group01{

    public StudentBiologyFacGroup01(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){

        name = namee;
        mathScore = mathScores;
        studentMathMark = mathScore;
        this.foreignLenguageScore = foreignLenguageScore;
        phisicalScore = phisicalScores;
        studentForeignLanguageMark = foreignLenguageScore;
    }
    public String toString(){
        return (name + " " + speciality + " " + facultetName + " " + mathScore + " " + foreignLenguageScore + " " + phisicalScore);
    }
    public String getName (){
        return name;
    }

    public String getFacultetName(){
        return facultetName;
    }

    public double averageMark(String mathScore, String foreignLenguageScore, String phisicalScore){
        return (Double.valueOf(mathScore) + Double.valueOf(foreignLenguageScore) + Double.valueOf(phisicalScore));
    }
}

