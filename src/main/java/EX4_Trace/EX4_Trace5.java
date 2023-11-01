public class EX4_Trace5 {
    public static void main(String[] args) {
        int wa = 0, k;                  //①
        for (k = 1;k <= 10; ++k)        //②
            wa += k;                    //③
        System.out.print(wa);           //④
    }
}
/*
 * トレース
 * wa       k       説明
 * 0        不定    ①int型wa,kの宣言。waを0で初期化
 * 0        1       ②kを1で初期化。条件式(k<=10)の評価でtrue、③へ
 * 1        1       ③waにkの値を追加
 * 1        2       kをインクリメント
 * 1        2       ②条件式(k<=10)の評価でtrue、③へ
 * 3        2       ③waにkの値を追加
 * 3        3       kをインクリメント
 * =================kが10を超えるまでループ
 * 45       10      ②条件式(k<=10)の評価でtrue、③へ
 * 55       10      ③waにkの値を追加
 * 55       11      kをインクリメント
 * 55       11      ②条件式(k<=10)の評価でfalse、④へ
 * 55       11      ④「55」を表示
 */