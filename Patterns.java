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
        // Pattern10(n);
        // Pattern11(n);
        // Pattern12(n);
        // Pattern13(n);
        // Pattern14(n);
        // Pattern15(n);
        // Pattern16(n);
        // Pattern17(n);
        Pattern18(n);
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

    static void Pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void Pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void Pattern13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void Pattern14(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void Pattern15(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + (n - i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void Pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ;
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            int breakPoint = i;
            for (int s = 0; s < (n - i - 1); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(ch);
                if (j < breakPoint)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }

    static void Pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E' - i); j <= 'E'; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}