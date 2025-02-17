import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class taraf3 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);


        String[] roz = {"shanbe","1shanbe","2shanbe","3shanbe","4shanbe","5shanbe","jome"};

        int a1 = x.nextInt();
        x.nextLine();
        String h1 = x.nextLine();
        String[]hh1 = h1.split(" ");


        int a2 = x.nextInt();
         x.nextLine();
        String h2 = x.nextLine();
        String[]hh2 = h2.split(" ");


        int a3 = x.nextInt();
        x.nextLine();
        String h3 = x.nextLine();
        String[]hh3 = h3.split(" ");

        int b = a1 +a2 + a3;
        String[] rozka = new String[b];
        
        System.arraycopy(hh1, 0, rozka, 0, hh1.length);
        System.arraycopy(hh2, 0, rozka, hh1.length, hh2.length);
        System.arraycopy(hh3, 0, rozka, hh1.length + hh2.length, hh3.length);

        // تبدیل دو آرایه به مجموعه‌ها
        Set<String> set1 = new HashSet<String> (Arrays.asList (roz));
        Set<String> set2 = new HashSet<String> (Arrays.asList (rozka));

        // پیدا کردن اشتراک دو مجموعه
       // Set<String> common = set1 & set2;

        set1.retainAll(set2);

       // System.out.println(set2);
       // System.out.println(set1.size());
        int c = 7 - set1.size();
        System.out.println(c);
       /* for (int i = 0; i < b; i++){
            rozka[i] = hh1 [i];
        }


       for (int i = 0; i < b; i++){

            System.out.println(rozka[i]);
        }

        */



    }
}
