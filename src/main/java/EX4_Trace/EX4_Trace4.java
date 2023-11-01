public class EX4_Trace4 {
    public static void main(String[] args) {
        int wa,k;                           //①

        wa = k = 0;                         //②
        while (k < 20) {                    //③
            wa += 3;                        //④
            k++;                            //⑤
        }
        System.out.print(wa);               //⑥
    }
}
/*
 * トレース
 * wa       k       説明
 * 不定     不定    ①int型wa,kの宣言
 * 0        0       ②wa,kを0で初期化
 * 0        0       ③条件式(k<20)でtrue、④へ
 * 3        0       ④waに3を追加
 * 3        1       ⑤kをインクリメント
 * 3        1       ③条件式(k<20)でtrue、④へ
 * 6        1       ④waに3を追加
 * 6        2       ⑤kをインクリメント
 * ================以降kが20になるまでループ
 * 57       19      ③条件式(k<20)でtrue、④へ
 * 60       20      ④waに3を追加
 * 60       21      ⑤kをインクリメント
 * 60       21      ③条件式(k<20)でfalse、⑥へ
 * 60       21      ⑥60を表示
 */