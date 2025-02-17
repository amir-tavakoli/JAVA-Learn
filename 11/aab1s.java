import java.util.Scanner;

public class aab1s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        if (a > 100){
            System.out.println("Steam");

        }else if(a < 0){
            System.out.println("Ice");


        }else {
            System.out.println("Water");
        }
    }
}
