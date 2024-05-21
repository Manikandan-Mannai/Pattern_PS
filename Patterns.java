import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Pattern1(n);
        // Pattern2n);
        // Pattern3(n);
        // Pattern4(n);
        // Pattern5(n);
        // Pattern6(n);
        // Pattern7(n);
        // Pattern8(n);
        // Pattern9(n);
        Pattern10(n);
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i - 1); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n) {
        Pattern7(n);
        Pattern8(n);
    }

    static void Pattern10(int n) {
        int l;
        for (int i = -n; i <= n; i++) {
            if (i < 0)
                l = -i;
            else
                l = i;
            for (int j = 0; j < (n - l + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}