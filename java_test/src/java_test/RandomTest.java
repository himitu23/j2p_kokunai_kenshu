package java_test;

import java.util.Random;//import文を自動挿入

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();//変数randは未使用
		
		int lucky = rand.nextInt(10);
		//System.out.print("乱数は");
		
		System.out.println("random number is " + lucky++);//変数を表示//文字連結
		System.out.println("random number is " + ++lucky);//変数を表示//文字連結
		/*片方文字列の場合は整数であっても文字列扱いになる。上の例だと文字列”random number"+"Rand"*/
		
		int i;//for文の初期化の位置に書いても構わない
		//繰り返し変数はデータとして扱わないほうが良い
		for(i=0;i<5;i++) System.out.println(i);
		
		String b = "すとりんぐ";//基本型と同じように扱えるのはStringのみ
		System.out.println(b);
				}

}
