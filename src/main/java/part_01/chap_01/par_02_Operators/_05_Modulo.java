package part_01.chap_01.par_02_Operators;

public class _05_Modulo {

    static final int b = 2;
    static int
            a,
            c = 3,
            d = -3,
            e = 2,
            f = -2;

    static void line() {
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("positive and negative numbers");
        line();

        a = c % e;
        System.out.println(" 3 % 2 : " + a);

        a = d % e;
        System.out.println("-3 % 2 :" + a);

        a = c % f;
        System.out.println(" 3 %-2 : " + a);

        a = d % f;
        System.out.println("-3 %-2 :" + a);
        line();
        a = e % c;
        System.out.println(" 2 % 3 : " + a);

        a = f % c;
        System.out.println("-2 % 3 :" + a);

        a = e % d;
        System.out.println(" 2 %-3 : " + a);

        a = f % d;
        System.out.println("-2 %-3 :" + a);

        a = c % d;
        System.out.println(" 3 %-3 : " + a);

        a = c % c;
        System.out.println(" 3 % 3 : " + a);

        line();
        System.out.println("automodulo (?) %=");
        line();

        a = b;
        a = a % c;
        System.out.println(" a % c : " + a);

        a = b;
        a %= c;
        System.out.println("a %= c : " + a);

        a = c;
        a %= d;
        System.out.println(a);
    }
}