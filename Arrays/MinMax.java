package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};
       Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		int ks = 0;
		int bs = 0;
		for(int i : list)
		{
			if(i < x)
			{
				ks = i;
			}
		}
		for(int j : list)
		{
			if(j > x)
			{
				bs = j;
				break;
			}
		}
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + ks);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + bs);


    }
}
