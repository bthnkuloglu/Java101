
public class Main {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("Maxi", 10,120,100,40);
    Fighter f2 = new Fighter("Lopez", 10,120,100,40);
    Match match = new Match(f1,f2,100,100);
    match.run();
    }
}