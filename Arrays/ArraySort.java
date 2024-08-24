package Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // Bir dizi tanımla ve bu diziyi küçükten büyüğe sırala
        int numbers[] = { 12, 23, 46, 223, 123, 75, 1, 2 };
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Eğer mevcut eleman bir sonrakinden büyükse, yer değiştir
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Küçükten büyüğe sıralanmış dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
