import java.util.Scanner;

public class chap2s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = new int[1000];
        int  b = 0;
        int  c = 0;

        while (true){
            b = x.nextInt();
            if (b != 0){
                a[c] = b;
                c++;
            }else {
                break;
            }
        }
        for (int j = c - 1; j >= 0 ; j--){
            System.out.println(a[j]);
        }



    }

}