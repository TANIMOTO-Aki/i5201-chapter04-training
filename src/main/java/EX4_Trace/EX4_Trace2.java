public class EX4_Trace2 {
    public static void main(String[] args) {
        int wa, k;                       //①
        for(wa = k = 0; k < 20; k++)    //②
            wa += 3;                    //③
        System.out.print(wa);           //④
    }
}
/*
 * トレース
 * wa           k                 説明
 * 不定         不定               ①int型「wa」「k」の宣言
 * 0            0                   ②「wa」「k」の初期化、条件式(k<20)の評価でtrue、③へ
 * 3            0                   ③waに3を追加
 * 3            0                   ②条件式(k<20)でtrue、③へ
 * 3            1                   kをインクリメント
 * 6            1                   ③waに3を追加
 * 6            1                   ②条件式(k<20)でtrue、③へ
 * 6            2                   kをインクリメント
 * 9            3                   ③waに3を追加
 * ================================ 以降kが20になるまでループ
 * 57           19                  ②条件式(k<20)でtrue、③へ
 * 57           20                  kをインクリメント
 * 60           20                  ③waに3を追加
 * 60           20                  ②条件式(k<20)でfalse、④へ
 * 60           20                  ④画面に「60」と表示する
 */
