import java.util.Scanner;

public class tst3s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int aa = x.nextInt();
        String a = x.next();
        String b = x.next();
        String[] first = a.split(  "");
        String[] second = b.split( "");

        int j = 0;

        for (int i = 0; i < aa; i++) {
            if (!first[i].equals(second[i])) {
                j++;
            }
        }        System.out.println(j);
    }
}
