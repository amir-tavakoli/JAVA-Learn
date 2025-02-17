import java.util.Scanner;

public class koare3 {
    public static void main(String[] args) {
        Scanner x = new  Scanner(System.in);

        int add1 = x.nextInt();
        int add2 = x.nextInt();
        int add3 = x.nextInt();
        int add4 = x.nextInt();

        String z1 = x.next();
        String z2 = x.next();
        String z3 = x.next();

        int v = 0;

        if (z1.equals("*") && z2.equals("*") && z3.equals("*") )
        {
            v = add1 * add2 * add3 * add4;
        }

        if (z1.equals("*") && z2.equals("*") && z3.equals("+") )
        {
            v = add1 * add2 * add3 + add4;
        }

        if (z1.equals("*") && z2.equals("+") && z3.equals("+"))
        {
            v = add1 * add2 + add3 + add4;
        }

        if (z1.equals("+") && z2.equals("+") && z3.equals("+") )
        {
            v = add1 + add2 + add3 + add4;
        }

        if (z1.equals("+") && z2.equals("*") && z3.equals("*") )
        {
            v = add1 + (add2 * add3 * add4);
        }

        if (z1.equals("+") && z2.equals("+") && z3.equals("*") )
        {
            v = add1 + add2 + (add3 * add4);
        }
        if (z1.equals("+") && z2.equals("*") && z3.equals("+") )
        {
            v = add1 + (add2 * add3) + add4;
        }
        if (z1.equals("*") && z2.equals("+") && z3.equals("*") )
        {
            v = (add1 * add2) + (add3 * add4);
        }

        System.out.print(v);
    }
}
