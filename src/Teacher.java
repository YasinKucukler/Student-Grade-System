//Teacher Sınıfı Özellikleri :
//        Nitelikler : name,mpno,branch
//        Metotlar : Teacher()

public class Teacher {
    String name;
    String cellNum;
    String branch;

    Teacher(String name, String cellNum, String branch)
    {
        this.name = name;
        this.cellNum = cellNum;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon numarası : " + this.cellNum);
        System.out.println("Bölümü : " + this.branch);
    }
}
