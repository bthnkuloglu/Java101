public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Bob", 5000,55,2015);
        e1.printInfo();
        e1.calcTax();
        e1.bonus();
        e1.raiseSalary();
        
    }
}