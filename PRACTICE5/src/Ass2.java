public class Ass2 {
    public static void main(String[] args) {
        int x = 1;
        int f = 1;
        int z = 1;
        for (int v = 1; v < 7; v++) {
            for (z = 7; z >= v; z--) {
                System.out.print(" ");
            }
            for (f = 1; f <= x;f = f + 1){
                System.out.print(v);
            }
            x = x + 2;
            System.out.println();

        }

    }
}

