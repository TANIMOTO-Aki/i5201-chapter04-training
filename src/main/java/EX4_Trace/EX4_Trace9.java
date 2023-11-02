public class EX4_Trace9 {
    public static void main(String[] args) {
        int wa = 0, k;                              //①
        int[] arreySu = {10, 20, 30, 40, 50};       //②

        for (int su: arreySu) {                     //③
            wa += su;                               //④
        }
        System.out.print("wa = " + wa);             //⑤
    }
}
/*
 * トレース
 * wa       Su       arreySu                説明
 * 0        -       -                       ①int型wa,kを宣言。waを0で初期化。kは使用されない
 * 0        -       [10][20][30][40][50]    ②int型配列変数arreySuを宣言、要素数５で
 *                                          　arreySu[0]に10、arreySu[1]に20、arreySu[2]に30、arreySu[3]に40、arreySu[4]に50を代入
 * 0        10      省略                    ③拡張for文によりint型Suを宣言、配列arreySuを選択。arreySu[0]の値10をSuに代入
 * 10       10                              ④waにSuの値を追加
 * 10       20                              ③SuにarreySu[1]の値20を代入
 * 30       20                              ④waにSuの値を追加
 * 30       30                              ③SuにarreySu[2]の値30を代入
 * 60       30                              ④waにSuの値を追加
 * 60       40                              ③SuにarreySu[3]の値40を代入
 * 100      40                              ④waにSuの値を追加
 * 100      50                              ③SuにarreySu[4]の値50を代入
 * 150      50                              ④waにSuの値を追加
 * 150      50                              ループ処理終了⑤へ
 * 150      50                              ⑤wa=150と表示
 */