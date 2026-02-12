// 課題１（入力されたサイズ＝n、数値と＄の数が比例して増えていく）
import java.util.Scanner;

public class iffor {

	public static void main(String[] args) {
        // スキャナー取り込み
        Scanner scanner = new Scanner(System.in);

        // 入力コンソール
        System.out.print("サイズを入力してください：");
        int size = scanner.nextInt();

        // 定義：int i = 1、サイズ数以下、＋1ずつ出力していく
        for (int i = 1; i <= size; i++) {

            // ＄を出力
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }

            // 改行
            System.out.println();
        }

        // スキャナー終了
        scanner.close();
    }
}

// 課題２（逆三角形、下に行くほど空白が増える＆жが減る）
import java.util.Scanner;

public class iffor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力コンソール
        System.out.print("サイズを入力してください：");
        int size = scanner.nextInt();

        // 定義：int i = 1、サイズ数未満、＋1ずつ出力していく
        for (int i = 0; i < size; i++) {

            // 空白を出力
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // жを出力
            for (int j = 0; j < size -i; j++) {
                System.out.print("ж");
            }

            // 改行
            System.out.println();
        }
        scanner.close();
    }
}

// 課題３（жが奇数個でできた逆三角形、1行目が最大数で最後が1個、左に余白あり）
import java.util.Scanner;

public class iffor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力コンソール
        System.out.print("サイズを入力してください：");
        int size = scanner.nextInt();

        // for文の外で宣言
        int i;

        for (int i = 0; i < size; i++) {

            // 空白
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // жを出力
            for (int j = 0; j < (size - i) * 2 - 1; j++) {
                System.out.print("ж");
            }

            // 改行
            System.out.println();
        }
        scanner.close();
    }
}

// 課題４（正数＝n、1～30のランダムな正数、大きい順に並び替える）
// i=数を数える為の変数　j=iの中で使う別の変数　n=繰り返す回数や配列のサイズ
import java.util.Scanner;
import java.util.Random;

public class iffor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 入力コンソール
        System.out.print("数字を入力してください：");
        int n = scanner.nextInt();

        //入力チェックをする（もし、0以下が入力された場合はエラーを返す）
        if (n <= 0) {
            System.out.println("1以上の正の数を入力してください");
            scanner.close();
            return;
        }

        // int型の数字をn個入れられる箱（配列）を作って、名前をnumbersにする
        int[] numbers = new int[n];

        // ランダム数の生成（1～30）
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(30) + 1;
        }

        // 上で生成された数字を表示する（数字の後に「、」を入れる）
        System.out.print("生成された数字は、");
        for (int i = 0;i < n; i++) {
            System.out.print(numbers[i]);
            // n-1は配列の最大インデックス
            if (i != n -1) {
                System.out.print("、");
            }
        }
        System.out.println("です。");

        // ソート処理（数字を大きい順に並び変える）
        for (int i = 0; i < n - 1; i++) {
            // 隣の数字同士を比較させる
            for (int j = 0; j < n - 1 - i; j++) {
                // 左の方が小さければ入れ替える
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // ソート後の表示
        System.out.print("大きい順に並べると、");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i != n - 1) {
                System.out.print("、");
            }
        }
        System.out.println("です。");

        scanner.close();
    }
}