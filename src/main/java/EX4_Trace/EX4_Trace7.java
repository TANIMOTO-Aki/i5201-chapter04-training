public class EX4_Trace7 {
    public static void main(String[] args) {
        int wa = 0, k;              //①

        k = 1;                      //②
        while(k <= 10) {            //③
            wa += k;                //④
            ++k;                    //⑤
        }
        System.out.print(wa);       //⑥
    }
}
/*
 * トレース
 * wa       k       説明
 * 0        不定    ①int型waを初期値0で宣言、kを宣言
 * 0        1       ②kを1で初期化
 * 0        1       ③条件式(k<=10)の評価true、④へ
 * 1        1       ④waへkの値を追加
 * 1        2       ⑤kをインクリメント
 * 1        2       ③条件式(k<=10)の評価true、④へ
 * 3        2       ④waへkの値を追加
 * 3        3       ⑤kをインクリメント
 * ================以降kが10を超えるまでループ
 * 45       10      ③条件式(k<=10)の評価true、④へ
 * 55       10      ④waへkの値を追加
 * 55       11      ⑤kをインクリメント
 * 55       11      条件式(k<=10)の評価false、⑥へ
 * 55       11      「55」を表示
 */