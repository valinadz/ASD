public class DeretBilangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 6 || i == 10) {
                continue; // Skip angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
