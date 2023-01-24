package jp.ac.uryukyu.ie.e225739;

public class GameMaster {
    //ランダムで３つの数字を作成
    public static int[] answerNumber() {
        int[] answer = new int[Main.number];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int) (Math.random()*9+1);
            for(int j = i -1; j>= 0; j--) {
                if(answer[j] == answer[i]) {
                    answer[i] = (int)(Math.random()*9+1);
                }
            }
        }
        return answer;
    }
    
        //eatかbiteのどちらであるかを判断
    public static void checkAnswer(int[] true_answer, int[] player_answer) {
        for(int i = 0; i< true_answer.length; i++) {
            for(int j = 0; j < player_answer.length; j++) {
                if(true_answer[j] == player_answer[i]) {
                    if(j==i) {
                        Main.eat++;
                    }
                    else{
                        Main.bite++;
                    }
                }
            }
        }
    System.out.println(Main.eat+" eat "+ Main.bite +" bite");
    }
    
}
