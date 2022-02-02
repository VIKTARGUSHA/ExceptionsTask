package Univercity.BiologyFac;

import Univercity.MehMatFac.MehMatFacultet;

public class StudentBiologyFacGroup03 extends Group03 {

    public StudentBiologyFacGroup03(String namee, String mathScores, String foreignLenguageScores, String phisicalScores){
        name = namee;
        mathScore = mathScores;
        foreignLenguageScore = foreignLenguageScores;
        phisicalScore = phisicalScores;
        studentMathMark = mathScore;
        studentForeignLanguageMark = foreignLenguageScore;
    }


    public String toString(){
        return (name + " " + speciality + " " + facultetName + " " + mathScore + " " + foreignLenguageScore + " " + phisicalScore);
    }
    public String getName (){
        return name;
    }
    public String getMathScore(){
        return  mathScore;
    }
    public String getForeignLenguageScore(){
        return foreignLenguageScore;
    }
    public String getPhisicalScore(){
        return  phisicalScore;
    }
    public String getFacultetName(){
        return facultetName;
    }
}
