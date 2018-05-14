package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();
		
		
		
		cars[0].serialNo = 0;
		cars[0].color = "Red";
		cars[0].gasoline = 50;
		cars[1].serialNo = 1;
		cars[1].color = "green";
		cars[1].gasoline = 100;
		cars[2].serialNo = 2;
		cars[2].color ="blue";
		cars[2].gasoline = 200;
		
		int sum = 0;
		int count = 0;
		final int distance = 300;
		
		
		
		while(true) {
			
		
			int run = cars[0].run();
			count++;

			if(run == -1) {
				System.out.println("目的地に到達できませんでした。");
				break;
			}

			sum += run;
			System.out.println(sum);

			if(distance < sum ) {
				System.out.println("car0は目的地にまで" + count + "時間かかりました。残りのガソリンは、"+cars[0].gasoline);
				break;
		}
		
		}
		int a = 0;
		int c = 0;
		while(true) {
			int run = cars[1].run();
			a++;

			if(run == -1) {
				System.out.println("目的地に到達できませんでした。");
				break;
			}

			c += run;
			System.out.println(c);

			if(distance < c ) {
				System.out.println("car1は目的地にまで" + a + "時間かかりました。残りのガソリンは、"+cars[1].gasoline);
				break;
		}
		}
		int b = 0;
		int d = 0;
		
		while(true) {
			int run = cars[2].run();
			b++;

			if(run == -1) {
				System.out.println("目的地に到達できませんでした。");
				break;
			}

			d += run;
			System.out.println(d);

			if(distance < d ) {
				System.out.println("car2は目的地にまで" + b + "時間かかりました。残りのガソリンは、"+cars[2].gasoline);
				break;
		}
		}

	}
}
