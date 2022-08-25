package studentGradeSystem;

public class Teacher {
    String name;
    String mpno;
    //mpno = telefon numarası
    String branch;
    //branch = bölümü

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;

    }

    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Telefon No : " + this.mpno);
        System.out.println("Bolumu : " + this.branch);

    }
}
