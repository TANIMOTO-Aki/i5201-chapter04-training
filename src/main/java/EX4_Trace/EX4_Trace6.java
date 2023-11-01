public class EX4_Trace6 {
    public static void main(String[] args) {
        int wa = 5, k = 10;         //①
        for (;k>20;k++)             //②
            wa += 3;                //③
        System.out.print(wa);       //④
    }
}
/*
 * トレース
 * wa       k       説明
 * 5        10      ①int型waを宣言し5で初期化、kを宣言し10で初期化
 * 5        10      ②for文は「kが20より"大きい"場合」のためfalse、ループせず④へ
 * 5        10      ③「5」と表示
 */