package Univercity.PhisFac;

public class StudentPhisFacGroup01 extends Group01 {
    String name;
    double mathScore, foreignLenguageScore, phisicalScore;
    StudentPhisFacGroup01(String name, double mathScore, double foreignLenguageScore, double phisicalScore){
    this.name = name;
    this.mathScore = mathScore;
    this.foreignLenguageScore = foreignLenguageScore;
    this.phisicalScore = phisicalScore;
    }
    public String toString(){
        return (name + " " + speciality + " " + facultetName + " " + mathScore + " " + foreignLenguageScore + " " + phisicalScore);
    }
}
