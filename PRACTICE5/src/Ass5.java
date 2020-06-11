public class Ass5 {
    public static void main(String[] args) {
        int x = 1;
        for (int v = 1; v <= 9; v++) {
            for (int z = 9; z >= 1; z--) {
                System.out.print("  ");
            }
            for (int f = 1; f <= x;f = f + 1){
                System.out.print(v);
            }
            x = x + 2;
            System.out.println();

        }

    }
}