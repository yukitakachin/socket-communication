import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws IOException {
        Responser responser = new Responser();

        //クライアントの要求に応じてゲームデータを送信
        responser.sendGameData();

        //クライアントはゲームをプレイ中・・・
        
        //スコアの受信・登録・ランキングの送信
        // responser.updateRanking();
    
    }

}
