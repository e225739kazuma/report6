/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e225739;

public class Main {
    static int number = 3;
    static int eat = 0;
    static int bite = 0;
    static int count = 1;

    public static void main(String[] args) {
        printRule();
        int[] true_answer;
        true_answer = GameMaster.answerNumber();

        while(true) {
            int[] player_answer;
            player_answer = Player.playerAnswer();
            GameMaster.checkAnswer(true_answer, player_answer);
            count++;
            if(eat == number) {
                System.out.println("正解です!ゲームを終了します。");
                break;
            }
               
        }
    }
    

    

    public static void printRule() {
        //ゲームのタイトルとルール説明
        String title = "   [CodeBreaker]   ";
        String rule = "3つの数字を当てよう！\n" + "数字は０〜９まであります。\n"+"３つの数字の中に同じ数字はありません。\n"+"数字と数字の位置が合っていたらeat。\n"
                      +"数字だけ合っていたらbite。\n"+"3つの数字と数字の場所が合っていたら(全てeatなら)\n"+"ゲーム終了です。";
    
        System.out.println(title);
        System.out.println(rule);
    
    }
}
