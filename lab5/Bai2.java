import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void AddStack(Stack S, int n) {
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            S.add(x);
        }
    }

    public static void DisplayStack(Stack S, int m) {
        for (int i = 0; i < m; i++) {
            int x = (int) S.pop();
            System.out.println("Pop:" + x + " ");
        }
        System.out.println("Stack:" + S + " ");
    }

    public static void main(String[] args) {
        Stack S = new Stack();
        int n = scanner.nextInt();
        AddStack(S, n);
        int m = scanner.nextInt();
        DisplayStack(S, m);
    }
}
