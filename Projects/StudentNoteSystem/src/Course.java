import java.sql.SQLOutput;

public class Course {
    Teacher teacher;
    String name, code, prefix;
    int note, practise;
    double score;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int practise = 0;
        double score = 0 ;
    }

    void AddTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
           //  printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve ders kodu uyuşmuyor.");


        }
    }

    void printTeacherInfo() {
        this.teacher.printTeacherInfo();
    }
}
