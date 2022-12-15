import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //secondMax
        int[] arr = {1,2,5,7,8,9,2,4,77,77,88,52,44,55,88,55,7,89};
        int [] result = secondMax(arr);
        System.out.print("2. maximum je " + result[0]);
        System.out.println(" a pocet jeho vyskytu je " + result[1]);

        //NSD
        System.out.println("Nejvetsi spolecny delitel je " + NSD(985,9845));


    }
    public static int[] secondMax(int[] arr)
    {
        int max = -2;
        int vyskyt = 0;
        int s_max = -1;
        int s_vyskyt = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if(x == max) {
                vyskyt ++;
            } else if (x > max) {
                s_max = max;
                s_vyskyt = vyskyt;
                max = x;
                vyskyt = 1;
            } else if (x > s_max) {
                s_max = x;
                s_vyskyt = 1;
            }
        }
        return new int[]{s_max, s_vyskyt};
    }

    public static int NSD(int x, int y) {
        while(x != y)
        {
            if(x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
}