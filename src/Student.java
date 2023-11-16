//Student Sınıfı Özellikleri :
//        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course oralExamGrade;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(double note1,double c1OralExamGrade,  double note2,double c2OralExamGrade, double note3, double c3OralExamGrade)
    {
        if (note1 >= 0 && note1 <= 100)
        {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100)
        {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100)
        {
            this.c3.note = note3;
        }
        if (c1OralExamGrade >= 0 && c1OralExamGrade <= 100)
        {
            this.c1.oralExamGrade = c1OralExamGrade;
        }
        if (c2OralExamGrade >= 0 && c2OralExamGrade <= 100)
        {
            this.c2.oralExamGrade = c2OralExamGrade;
        }
        if (c3OralExamGrade >= 0 && c3OralExamGrade <= 100)
        {
            this.c3.oralExamGrade = c3OralExamGrade;
        }
    }

    void printNote(){

        System.out.println(c1.name + " Notu : " + (this.c1.note *6/10 + this.c1.oralExamGrade*4/10));
        System.out.println(c2.name + " Notu : " + this.c2.note *7/10 + this.c2.oralExamGrade*3/10);
        System.out.println(c3.name + " Notu : " + this.c3.note *8/10 + this.c3.oralExamGrade*2/10);
        System.out.println("Ortalamanız : " + this.average);
    }

    void isPass()
    {
        this.average = ((this.c1.note* 6/10 + this.c1.oralExamGrade * 4/10) +
                (this.c2.note * 7/10 + this.c2.oralExamGrade *3/10) +
                (this.c3.note * 8/100 + this.c3.oralExamGrade *2/10))  /3.0;
        if (this.average > 55)
        {
            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass = true;
        }
        else {
            System.out.println("Hababam sınıfı sınıfta kaldı.");
            this.isPass = false;
        }
        printNote();
        System.out.println("-----------------------------------------------");
    }
}
