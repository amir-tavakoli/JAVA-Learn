import java.util.Scanner;

public class am3s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        int n = x.nextInt();

        String[] a = new String[7];

        a[0] = "sib";
        a[1] = "samanoo";
        a[2] = "somagh";
        a[3] = "sabze";
        a[4] = "sir";
        a[5] = "seke";
        a[6] = "senjed";

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);


        }
    }
}
