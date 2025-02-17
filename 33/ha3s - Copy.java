import java.util.Scanner;

public class ha3s {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);

        int[] n = new int[6];

        for (int i = 0; i < 6; i++) {
            n[i] = x.nextInt();

        }

        for (int i = 0; i < 2; i++) {
            System.out.print(1 - n[i] + " ");

        }

        for (int i = 2; i < 5; i++) {
            System.out.print(2 - n[i] + " ");

        }

        System.out.println(8 - n[5]);
    }
}
