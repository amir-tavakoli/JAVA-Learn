import java.util.Scanner;

public class Chap {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int add1 = x.nextInt();
        int i;
        int j;
        for (i = add1; i > 0;){

            for (j = add1; j > 1; ){
                System.out.print("*");
                if (i == 0){
                    System.out.println();

                }
                --j;
            }
            System.out.print("*");
            System.out.println();
            --i;
        }



    }
}




