package Univercity.BiologyFac;

import Univercity.MehMatFac.MehMatFacultet;

public class StudentBiologyFacGroup02 extends Group02{

    public StudentBiologyFacGroup02(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){

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
