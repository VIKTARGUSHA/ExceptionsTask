package Univercity.InternationalRelativeShipsFac;

public class StudentInternationalRelativeShipsFacGroup03 extends Group03{
    String name;
    double mathScore, foreignLenguageScore, phisicalScore;
    public StudentInternationalRelativeShipsFacGroup03(String name, double mathScore, double foreignLenguageScore, double phisicalScore){
        this.name = name;
        this.mathScore = mathScore;
        this.foreignLenguageScore = foreignLenguageScore;
        this.phisicalScore = phisicalScore;
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
