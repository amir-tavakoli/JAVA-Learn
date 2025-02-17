import java.util.Scanner;

public class addchap3 {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);

            String number = x.nextLine();
            for (char digit : number.toCharArray()) {
                int count = Character.getNumericValue(digit);
                System.out.print(digit + ": ");
                for (int i = 0; i < count; i++) {
                    System.out.print(digit);
                }
                System.out.println();
            }
        }
    }


