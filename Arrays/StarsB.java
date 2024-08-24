package Arrays;

public class StarsB {
    public static void main(String[] args) {
      	
        String[][] arry = new String[5][4];

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (j == 0 || i == 0 && j != 3 || i == 1 && j == 3 || i == 2 || i == 3 && j == 3 || i == 4 && j != 3) {
                    arry[i][j] = "*";
                } else {
                    arry[i][j] = " ";
                }
            }
        }

        // Array'i yazdırma
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
		

    }
}
