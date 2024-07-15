import java.util.*;

public class AvaragePoint {
 public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.print("Math Note: ");
    int math = k.nextInt();
    System.out.print("Physics Note: ");
    int physics = k.nextInt();
    System.out.print("Chemistry Note: ");
    int chemistry = k.nextInt();
    System.out.print("Turkish Note: ");
    int turkish = k.nextInt();
    System.out.print("Music Note: ");
    int music = k.nextInt();
    if (math < 0 || math > 100) {
        math = 0;
    }
    if (physics < 0 || physics > 100) {
        physics = 0;
    }
    if (chemistry < 0 || chemistry > 100) {
        chemistry = 0;
    }
    if (turkish < 0 || turkish > 100) {
        turkish = 0;
    }
    if (music < 0 || music > 100) {
        music = 0;
    }
    int avarage= (math + physics + chemistry + turkish + music) / 5;
    System.out.println("Avarage: " + avarage);
    if(avarage>=55) {
        System.out.println("Congratulations, you passed the class.");
    } else {
        System.out.println("Sorry, you failed the class.");
    }

 }    
}
