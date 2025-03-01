public class Triangles {
    public static void main(String[] args) {
        int n = 10;
        for (int count = 1; count <= n; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.print("    ");
            for (int counter = 1; counter <= (n - count + 1); counter++) {
                System.out.print("*");
            }
            System.out.print("    ");
            for (int counter = 1; counter <= (n - count); counter++) {
                System.out.print(" ");
            }
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.print("    ");
            for (int counter = 1; counter <= (count - 1); counter++) {
                System.out.print(" ");
            }
            for (int counter = 1; counter <= (n - count + 1); counter++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







