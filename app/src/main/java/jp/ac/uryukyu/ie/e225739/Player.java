package jp.ac.uryukyu.ie.e225739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    public static int[] playerAnswer() {
       //プレイヤーの挑戦した回数と数字の入力したり読み込んだりするためのメソッド
        int[] answer = new int[Main.number];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n"+Main.count+"回目の挑戦");
        for(int i = 0; i<answer.length; i++) {
            try {
                System.out.print((i+1)+"つ目の数字");
                String a = reader.readLine();
                int b = Integer.parseInt(a);
                answer[i] = b;
            }
            catch(NumberFormatException e) {
                System.out.println("数字を入力してください");
                i--;
            }
            catch(IOException e) {
                System.out.println("形式が間違っています");
                i--;
            }

        }
        return answer;
    }
   
        
}
