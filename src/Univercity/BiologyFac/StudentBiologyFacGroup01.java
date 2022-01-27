package Univercity.BiologyFac;

import Univercity.Univercity;

public class StudentBiologyFacGroup01 extends Group01{
    String name;
    double mathScore, foreignLenguageScore, phisicalScore;
    public StudentBiologyFacGroup01(String name, double mathScore, double foreignLenguageScore, double phisicalScore){
        this.name = name;
        this.mathScore = mathScore;
        studentMathMark = mathScore;
        this.foreignLenguageScore = foreignLenguageScore;
        this.phisicalScore = phisicalScore;
        studentForeignLanguageMark = foreignLenguageScore;

    }
    public String toString(){
        return (name + " " + speciality + " " + facultetName + " " + mathScore + " " + foreignLenguageScore + " " + phisicalScore);
    }
    public String getName (){
        return name;
    }
    public double getMathScore(){
        return  mathScore;
    }
    public double getForeignLenguageScore(){
        return foreignLenguageScore;
    }
    public double getPhisicalScore(){
        return  phisicalScore;
    }
    public String getFacultetName(){
        return facultetName;
    }

    public double averageMark(double mathScore, double foreignLenguageScore, double phisicalScore){
        return (mathScore + foreignLenguageScore + phisicalScore);
    }
}

