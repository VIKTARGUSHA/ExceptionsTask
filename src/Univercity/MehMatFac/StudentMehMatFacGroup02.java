package Univercity.MehMatFac;

public class StudentMehMatFacGroup02 extends Group02{

    public StudentMehMatFacGroup02(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){
        super();
        new MehMatFacultet();
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
