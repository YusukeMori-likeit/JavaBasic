package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= 5;j++) {
				if(j > (i - 1)) {
					System.out.print("□");
				}else {
					System.out.print("■");
				}
			}
			System.out.println();

		}
		for(int k = 1;k <= 5;k++) {
			
			for(int l = 1;l <= 5;l++) {
				
				if(((k+l) >= 7 && (k+l) <= 10)) {
					
					System.out.print("□");
					
				}else {
					System.out.print("■");
				}
				
			}
			System.out.println();
		}
		
		
		}
		
		

	}
	

