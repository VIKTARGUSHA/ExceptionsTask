package Univercity.MehMatFac;

public class StudentMehMatFacGroup01 extends Group01 {

    public StudentMehMatFacGroup01(String namee, String mathScores, String foreignLenguageScore, String phisicalScores){

        name = namee;
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
}
