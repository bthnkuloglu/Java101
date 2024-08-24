package Arrays;

public class RepeatNumbersFreq  {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 12, 24, 3, 12, 59, 24, 90, 90, 100, 24, 3 };

        System.out.println("Tekrar eden sayılar ve tekrar sayıları:");

        // Dizinin her elemanını kontrol et
        for (int i = 0; i < numbers.length; i++) {
            int count = 1; // Mevcut elemanın sayısını tutmak için bir sayaç

            // Aynı sayıyı birden fazla yazdırmamak için kontrol
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // Eğer sayı daha önce sayılmışsa bu turu atla
            }

            // Dizinin geri kalanını kontrol et
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            // Sadece tekrar eden sayıları ekrana yazdır
            if (count > 1) {
                System.out.println(numbers[i] + " sayısı " + count + " kez tekrar etti.");
            }
        }
    }
}
