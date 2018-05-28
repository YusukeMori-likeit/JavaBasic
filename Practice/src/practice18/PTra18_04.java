/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
        ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] word = line.split(",",0);

                Player player = new Player();
                player.setPosition(word[0]);
                player.setName(word[1]);
                player.setCountry(word[2]);
                player.setTeam(word[3]);

                array.add(player);
            }
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        Collections.shuffle(array);
        for(int i = 0;i < array.size();i++) {
        	if(array.get(i).getPosition().equals("GK")) {
        		System.out.println(array.get(i).toString());
        	
        		a++;
        	}
        	if(a == 1) {
        		break;
        	}
        }
        for(int i = 0;i < array.size();i++) {
        	if(array.get(i).getPosition().equals("DF")) {
        		System.out.println(array.get(i).toString());
        		b++;
        	}
        	if(b == 4) {
        		break;
        	}
        }
        for(int i = 0;i < array.size();i++) {
        	if(array.get(i).getPosition().equals("MF")){
        		System.out.println(array.get(i).toString());
        	c++;
        	}
        	if(c == 4) {
        		break;
        	}
        }
        for(int i = 0;i<array.size();i++) {
        	if(array.get(i).getPosition().equals("FW")) {
        		System.out.println(array.get(i).toString());
        		d++;
        	}
        	if(d == 2) {
        		break;
        	}
        }

	}
}
