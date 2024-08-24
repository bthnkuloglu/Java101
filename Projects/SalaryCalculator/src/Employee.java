public class Employee {
    String name;
    int salary, workHours, hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);

    }
    void calcTax(){
        if (this.salary <=1000){
            System.out.println("Verginiz yoktur.");
        }else{
            this.salary = this.salary - (this.salary*5)/100;
            System.out.println("Vergi kesilmiş maaşınız: " + this.salary);
        }
    }

    void bonus() {
        if (this.workHours >= 30) {
            int bonus = this.workHours - 30;
            bonus = bonus * 30;
            System.out.println("Kazandığını bonus: " + bonus);
            this.salary += bonus;
            System.out.println("Bonusla beraber maaşı: " + this.salary);
        }
    }

    void raiseSalary() {
        int x = this.hireYear - 2021;
        if (x <= 10) {
            this.salary = this.salary + (this.salary * 5) / 100;
            System.out.println("Yıllık artışlı maaş miktarı: " + this.salary);
        } else if (x >= 10 && x <= 20) {
            this.salary = this.salary + (this.salary * 10) / 100;
            System.out.println("Yıllık artışlı maaş miktarı: " + this.salary);
        } else if (x >= 20) {
            this.salary = this.salary + (this.salary * 20) / 100;
            System.out.println("Yıllık artışlı maaş miktarı: " + this.salary);
        } else {
            System.out.println("Yıllık maaş artışınız yoktur.");
        }

    }
}