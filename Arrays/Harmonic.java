package Arrays;
public class Harmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);
        //Calculate numbers harmonic means
        double sumOfReciprocals = 0.0;

        // Dizi elemanlarının terslerinin toplamını hesapla
        for (int i = 0; i < numbers.length; i++) {
            sumOfReciprocals += 1.0 / numbers[i];
        }

        // Harmonik ortalamayı hesapla
        double harmonicMean = numbers.length / sumOfReciprocals;

        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
