package Univercity.InternationalRelativeShipsFac;

import Univercity.MehMatFac.MehMatFacultet;

public class StudentInternationalRelativeShipsFacGroup03 extends Group03{
    String name;
  //  double mathScore, foreignLenguageScore, phisicalScore;
    public StudentInternationalRelativeShipsFacGroup03(String name, double mathScores, double foreignLenguageScore, double phisicalScores){
//        super();
//        new InternationalRelativShipsFac();
        this.name = name;
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
}
