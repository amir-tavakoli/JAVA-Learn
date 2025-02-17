import java.util.Scanner;

public class bahdaht1s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = a - b;
        if (b == 0 ){
            System.out.println("20");

        }else if (7 == b){

            System.out.println(a);

        }else {
            if (c < 0){
                System.out.println(0);

            }else System.out.println(c);


        }
    }
}
