package java_test;


//import lib.Input;

public class String_new {
	
	static int number(){
		//return System.in.read();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "school";
		if(s1.equals("School")) System.out.println("等しいです");
		/* 文字列のみ、この比較メソッドを使う。strcmp */
		else System.out.println("等しくない");
		
		int num = number();
		System.out.print(num);
	}
	


}