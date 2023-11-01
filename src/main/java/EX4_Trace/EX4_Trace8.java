public class EX4_Trace8 {
    public static void main(String[] args) {
        int wa = 5, k = 10;

        while (k>20) {
            wa += 3;
            k++;
        }
        System.out.print(wa);
    }
}
/*
 * トレース
 * wa       k       説明
 * 5        10      int型wa,kを宣言。初期値をwa=5、k=10に設定
 * 5        10      条件式(k>20)の評価false
 * 5        10      「5」を表示
 */