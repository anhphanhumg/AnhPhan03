import java.security.Principal;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai1 {
    public static void AddInList(LinkedList L, int n) {
        while (n != 0) {
            int i = n % 10;
            L.addFirst(i);
            n /= 10;
        }
    }

    public static boolean CheckList(LinkedList L) {
        for (int i = 0; i < L.size() / 2; i++) {
            if (L.get(i) != L.get(L.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        AddInList(L, n);
        if (CheckList(L))
            System.out.print("n la so thuan nghich");
        else
            System.out.print("n khong phai la so thuan nghich");
    }
}
