import java.util.Scanner;
import java.util.Arrays;

public class jaigasht4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            if (isPermutation(str1, str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        public static boolean isPermutation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
    }


