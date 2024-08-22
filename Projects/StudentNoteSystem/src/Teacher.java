public class Teacher {
    String name, branch, phone;
    Teacher (String name, String branch, String phone) {
        this.name = name;
        this.branch = branch;
        this.phone = phone;

    }
    void printTeacherInfo(){
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);

    }
}
