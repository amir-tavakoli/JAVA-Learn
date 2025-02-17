import java.util.Scanner;

public class namaei {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);

       long add1;
       double add2;

       do {
           add1 = x.nextLong();

       }    while (add1 < 1 && add1 > 10);

        do {
            add2 = x.nextLong();

        }    while (add2 < 1 && add2 > 18);
        int i;
        long zarb3 = 1;
        for (i = 0; i < add2;) {
             zarb3 *= add1;

            i++;



        }
        System.out.println(zarb3);



    }
}
