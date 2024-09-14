package Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Örnek matris
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Matrisin boyutlarını al
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpoze matrisini oluştur
        int[][] transposed = new int[cols][rows];

        // Transpoze matrisini hesapla
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Sonuçları yazdır
        System.out.println("Orijinal Matris:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze Matris:");
        for (int[] row : transposed) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
