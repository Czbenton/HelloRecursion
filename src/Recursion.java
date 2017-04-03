/**
 * Created by Zach on 4/3/17.
 */
public class Recursion {

    public static void main(String[] args) {
//        System.out.println(bunnyEars2(4));
//        System.out.println(triangle(6));
//        System.out.println(sumDigits(39));
//        System.out.println(factorial(6));
//        System.out.println(fibonacci(8));
//        System.out.println(count7(1237));
//        System.out.println(powerN(3,3));
//        System.out.println(countX("xxiouhhox"));
//        System.out.println(changeXY("xou-xx"));
//        System.out.println(changePi("xpixxxpi"));
        System.out.println(noX("xaxb"));
    }

    public static int bunnyEars2(int bunnies) {

        if (bunnies == 0) return 0;

        if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);

        else return 2 + bunnyEars2(bunnies - 1);

    }

    public static int triangle(int rows) {

        if (rows == 0) return 0;

        else return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {

        if (n < 10) return n;

        else return n % 10 + sumDigits(n / 10);

    }

    public static int factorial(int n) {

        if (n == 1) return 1;

        else return n * factorial(n - 1);

    }

    public static int fibonacci(int n) {

        if (n == 0) return 0;

        if (n == 1) return 1;

        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int count7(int n) {

        if (n < 10 && n == 7) return 1;

        if (n < 10 && n != 7) return 0;

        if (n % 10 == 7) return 1 + count7(n / 10);

        else return count7(n / 10);

    }

    public static int powerN(int base, int n) {

        if (n <= 1) return base;

        else return base * powerN(base, n - 1);
    }

    public static int countX(String str) {
        int result = 0;
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(0) == 'x') {
            result++;
        }

        result += countX(str.substring(1, str.length()));
        return result;
    }

    public static String changeXY(String str) {

//        This is not recursive... but if it works it works!

        if (str.length() > 0) {
            if (str.contains("x")) return str.replace('x', 'y');
            if (str.substring(0, 1).equalsIgnoreCase("x")) return str.replace('x', 'y');

            else return str;
        } else return str;


    }

    public static String changePi(String str) {

        if (str.equals("") || str.length() < 2) return str;

        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') return "3.14" + changePi(str.substring(2));

        else return str.charAt(0) + changePi(str.substring(1));

        // Let the recursion take care of the brute force. Just list the givens, and let it do the work
        // of progressing through the string.
    }

    public static String noX(String str) {

        if (str.length() == 0) return str;

        if (str.length() > 0 && str.substring(0,1).equalsIgnoreCase("x")) return "" + noX(str.substring(1));

        else return str.charAt(0) + noX(str.substring(1));

    }


}
