public class Student {
    Course c1, c2, c3;
    String name, no, classses;
    double avarage;
    boolean isPass;

    Student(String name, String no, String classses, Course c1, Course c2, Course c3) {
        this.name = name;
        this.no = no;
        this.classses = classses;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.avarage = 0.0;

    }

    void addNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addPseudoNote(int practise1, int practise2, int practise3) {
        if (practise1 >= 0 && practise1 <= 100) {
            this.c1.practise = practise1;
        }
        if (practise2 >= 0 && practise2 <= 100) {
            this.c2.practise = practise2;
        }
        if (practise3 >= 0 && practise3 <= 100) {
            this.c3.practise = practise3;
        }

    }

    void CalcGPA() {
        this.c1.score = (this.c1.note *0.8) + (this.c1.practise*0.2);
        this.c2.score = (this.c2.note *0.8) + (this.c2.practise*0.2);
        this.c3.score = (this.c3.note *0.8) + (this.c3.practise*0.2);
    }

     void isPass() {
         this.avarage = (this.c1.score + this.c2.score + this.c3.score) / 3.0;
         printNote();
             if(this.avarage >= 50) {
                 System.out.println("Başarıyla sınıfı geçtiniz.");
                 this.isPass = true;
             }else {
                 System.out.println("Sınıfta kaldınız.");
                 this.isPass = false;
             }
         System.out.println("Ortalamanız : " + this.avarage);
         }

    void printNote() {
        System.out.println(this.c1.name + " Notu : " + this.c1.note + " Sözlü : " + this.c1.practise);
        System.out.println(this.c2.name + " Notu : " + this.c2.note + " Sözlü : " + this.c2.practise);
        System.out.println(this.c3.name + " Notu : " + this.c3.note + " Sözlü : " + this.c3.practise);

    }
}
