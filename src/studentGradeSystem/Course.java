package studentGradeSystem;

public class Course {
    Teacher teacher;
    String name;
    //dersin adı
    String code;
    //dersin kodu
    String prefix;
    //dersin kısaltması
    double note;
    //dersin notu

    Course(String name, String code,String prefix){
        //dersin notu varsayılan 0 olacağı için alınmadı.
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else {
            System.out.println("Ogretmen ve Ders Bolumleri Uyusmuyor");
        }

    }
    void printTeacher(){
        this.teacher.print();

    }
}
