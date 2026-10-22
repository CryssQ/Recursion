public class Recursion {

    public static void print1ToN(int n) {
        if (n < 1) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void printAToB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) {
            return;
        }
        if (a < b) {
            printAToB(a + 1, b);
        } else {
            printAToB(a - 1, b);
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 1 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void checkPowerOfTwo(int n) {
        if (isPowerOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void printRightToLeft(int n) {
        if (n == 0) {
            return;
        }
        System.out.print((n % 10) + " ");
        printRightToLeft(n / 10);
    }

    public static void printLeftToRight(int n) {
        if (n == 0) {
            return;
        }
        printLeftToRight(n / 10);
        System.out.print((n % 10) + " ");
    }

    public static void main(String[] args) {
        System.out.println("--- Задача 1 ---");
        print1ToN(5);
        System.out.println("\n");

        System.out.println("--- Задача 2 ---");
        printAToB(5, 1);
        System.out.println("\n");

        System.out.println("--- Задача 3 ---");
        System.out.print("Для 8: ");
        checkPowerOfTwo(8);
        System.out.print("Для 3: ");
        checkPowerOfTwo(3);
        System.out.println();

        System.out.println("--- Задача 4 ---");
        System.out.println(sumOfDigits(179));
        System.out.println();

        System.out.println("--- Задача 5 ---");
        printRightToLeft(179);
        System.out.println("\n");

        System.out.println("--- Задача 6 ---");
        printLeftToRight(179);
        System.out.println();
    }
}
