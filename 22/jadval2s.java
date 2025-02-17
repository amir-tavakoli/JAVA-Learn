import java.util.Scanner;

public class jadval2s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        for (int i = 1;i <= a; i++ ){
            for (int j = 1; j <=a ; j++){
                System.out.print(j*i + " " );

            }
            System.out.println();
        }

    }
}
