public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "00000000000", "TRH");
        Teacher t2 = new Teacher("Grahamm Bell", "2222222222", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "33333333333", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,50,50,70, 43,22);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "333", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(100,70,64,70,66,44);
        s2.isPass();
    }
}