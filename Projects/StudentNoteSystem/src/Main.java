public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Lucas", "FZK", "500");
        Teacher t2 = new Teacher("Bob", "TRH", "300");
        Teacher t3 = new Teacher("Dan", "MTH", "400");

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.AddTeacher(t1);

        Course tarih = new Course("Tarih", "102", "TRH");
        tarih.AddTeacher(t2);

        Course math = new Course("Matematik", "103", "MTH");
        math.AddTeacher(t3);

        Student s1 = new Student("Mert", "10", "4", fizik, tarih, math);
        s1.addNote(100,40,30);
        s1.addPseudoNote(40,50,100);
        s1.CalcGPA();
        s1.isPass();


    }
}