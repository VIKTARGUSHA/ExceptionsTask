package Univercity.MehMatFac;

public class StudentMehMatFacGroup01 extends Group01 {
    String name;
   // double mathScore, foreignLenguageScore, phisicalScore;
    public StudentMehMatFacGroup01(String name, double mathScores, double foreignLenguageScore, double phisicalScores){
        super();
        new MehMatFacultet();
        this.name = name;
        mathScore = mathScores;
        this.foreignLenguageScore = foreignLenguageScore;
        phisicalScore = phisicalScores;
        studentMathMark = mathScore;
        studentForeignLanguageMark = foreignLenguageScore;
        speciality = speciality;
        facultetName = facultetName;
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
