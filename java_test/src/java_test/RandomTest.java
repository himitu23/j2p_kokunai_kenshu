package java_test;

import java.util.Random;//import���������}��

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();//�ϐ�rand�͖��g�p
		
		int lucky = rand.nextInt(10);
		//System.out.print("������");
		
		System.out.println("random number is " + lucky++);//�ϐ���\��//�����A��
		System.out.println("random number is " + ++lucky);//�ϐ���\��//�����A��
		/*�Е�������̏ꍇ�͐����ł����Ă������񈵂��ɂȂ�B��̗Ⴞ�ƕ�����hrandom number"+"Rand"*/
		
		int i;//for���̏������̈ʒu�ɏ����Ă��\��Ȃ�
		//�J��Ԃ��ϐ��̓f�[�^�Ƃ��Ĉ���Ȃ��ق����ǂ�
		for(i=0;i<5;i++) System.out.println(i);
		
		String b = "���Ƃ��";//��{�^�Ɠ����悤�Ɉ�����̂�String�̂�
		System.out.println(b);
				}

}
