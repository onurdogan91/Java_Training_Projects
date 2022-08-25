package studentGradeSystem;

import studentGradeSystem.Course;
import studentGradeSystem.Student;

public class studentGrade {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut " , "TRH" , "905370000000");
        Teacher t2 = new Teacher("Onur" , "FZK" , "0537");
        Teacher t3 = new Teacher("Kerem" , "BIO" , "0538");

        Course tarih = new Course("Tarih","101" , "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Eniz","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,100,50);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Mehmet","858","5",tarih,fizik,bio);
        s2.addBulkExamNote(50,30,82);
        s2.printNote();
        s2.isPass();

    }

}
