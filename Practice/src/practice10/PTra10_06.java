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

		final int distance = 300;

		for(int i = 0;i < cars.length;i++) {
			int sum0 = 0;
			int count0 = 0;

			while(true) {


				int run = cars[i].run();
				count0++;

				if(run == -1) {
					System.out.println("目的地に到達できませんでした。");
					break;
				}

				sum0 += run;
//				System.out.println(sum0);

				if(distance < sum0 ) {
					System.out.println(cars[i].color + "は目的地にまで" + count0 + "時間かかりました。残りのガソリンは、"+cars[i].gasoline);
					break;
			}

			}
		}


	}
}

