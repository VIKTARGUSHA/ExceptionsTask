package Univercity.MehMatFac;

public class StudentMehMatFacGroup01 extends Group01 {
    String name;
    double mathScore, foreignLenguageScore, phisicalScore;
    public StudentMehMatFacGroup01(String name, double mathScore, double foreignLenguageScore, double phisicalScore){
        this.name = name;
        this.mathScore = mathScore;
        this.foreignLenguageScore = foreignLenguageScore;
        this.phisicalScore = phisicalScore;
        studentMathMark = mathScore;
        studentForeignLanguageMark = foreignLenguageScore;
        specialityT = speciality;
        facultetNameT = facultetName;
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
