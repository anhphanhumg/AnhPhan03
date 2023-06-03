import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void SetQueue(Queue Q, int n) {
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            Q.add(x);
        }
    }

    static void RemoveM(Queue Q, int m) {
        for (int i = 0; i < m; i++) {
            int x = (int) Q.remove();
            System.out.println("Remove:" + x + " ");
        }
        System.out.println("Queue:" + Q + " ");
    }

    public static void main(String[] args) {
        Queue Q = new LinkedList<>();
        int n = scanner.nextInt();
        SetQueue(Q, n);
        int m = scanner.nextInt();
        RemoveM(Q, m);
    }
}
