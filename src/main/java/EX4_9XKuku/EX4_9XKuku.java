public class EX4_9XKuku {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9){
            for (int j = 1; j <= i; j++){
                for (int k = 1; k <= i; k++){
                    System.out.print(" " + j * k);
                }
                System.out.println();
            }
            i += 1;
            System.out.println();
        }
    }
}
