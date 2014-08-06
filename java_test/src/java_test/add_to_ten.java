package java_test;

public class add_to_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[10];//必ず初期化が必要
		
		int num = 1, sum = 0;
		
		for(int i=0;i<a.length;i++) a[i]=(num++);//iはこのスコープ内でのみ有効
		for(int i=0;i<a.length;i++) sum += a[i];
		
		int [] b = new int[a.length];//aと同じザイズの配列を用意
		
		for(int i=0;i<a.length;i++) b[i] = a[i];
		for(int i=0;i<a.length;i++) System.out.println(b[i]);
		
		/* a.lengthで配列aの要素数を取得すると依存しない */
		//for文分けたほうが処理が明確で良い
		System.out.println(sum);
	}

}
