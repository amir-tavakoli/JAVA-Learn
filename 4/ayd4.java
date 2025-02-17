import java.util.Scanner;

public class ayd4 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String h1 = x.nextLine();
        String[] hh1 = h1.split("/");

        int a = Integer.parseInt(hh1[0]);
        int b = Integer.parseInt(hh1[1]);
        int c = Integer.parseInt(hh1[2]);

        int adad;
        int a1 = a % 4;
        int adad1 = 30 - c;
        int b1 = 12 - b;
        int adad2 = b1 * 30;
        int adad22;
        if ( 7 - b > -1){
             adad22 = 7 - b ;

        }
        else {
             adad22 = 0;
        }

        if (a1 == 3 ){
            adad = adad1 + adad2 + adad22 + 1 ;

        }
        else {
            adad = adad1 + adad2 + adad22 - 1 + 1;
        }

        System.out.print(adad);

    }
}
