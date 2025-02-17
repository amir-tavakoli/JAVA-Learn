import java.util.Scanner;
import java.util.Arrays;

public class maglob2s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String a = x.next();

        String [] b = a.split("");
        String [] c = new String[a.length()];

        for (int i = 0  ; i < b.length ; i ++ ){
            c[i] = b[b.length - i - 1];
        }
        //System.out.println(Arrays.toString(c));

        if (Arrays.equals(b, c)){
            System.out.println("YES");
        }else {
            System.out.println("NO"); }

       // System.out.println(Arrays.toString(c));


    }
}
