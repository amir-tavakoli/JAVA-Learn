import java.util.Scanner;

public class blandgo4 {
    public static void main(String[] args) {

        Scanner x  = new Scanner(System.in);

        String a =x.next();

        String [] a1 = a.split("");
        int aa = a1.length;
        aa = aa-1;
        for (int i = 0; i <=aa; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a1[i]);
            }
            int k = i+1;
            for (;k <= aa; k++){
                System.out.print(a1[k]);
            }

            System.out.println();
        }




        //System.out.println(aa);




    }
}
