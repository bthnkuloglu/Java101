public class AsalSayi {
public static void main(String[] args) {
    
    //1-100 arası asal sayılar
    for (int i = 2; i <= 100; i++) {
        boolean asal = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                asal = false;
                break;
                }
                }
                if (asal) {
                    System.out.print(i + " ");
                    }
                    }

}   
}
