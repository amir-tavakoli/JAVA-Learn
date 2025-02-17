import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);

        long add1 = x.nextLong();
        long add4 = 1;

        for (long i = add1; i > 0;){

            add4 *= i;
            i--;


        }
        System.out.println(add4);
    }
}
