package Arrays;

public class RepeatEvenNumbers {
    public static void main(String[] args) {
        //Create a array and sout the repeating even numbers
        int[] numbers = {1,5,12,24,3,12,59,24,90,90,100,24,3};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                    break; // Aynı sayıyı birden fazla yazdırmamak için döngüden çık
                }
            }
        }
    }
}
