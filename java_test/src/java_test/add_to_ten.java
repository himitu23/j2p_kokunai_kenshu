package java_test;

public class add_to_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[10];//�K�����������K�v
		
		int num = 1, sum = 0;
		
		for(int i=0;i<a.length;i++) a[i]=(num++);//i�͂��̃X�R�[�v���ł̂ݗL��
		for(int i=0;i<a.length;i++) sum += a[i];
		
		int [] b = new int[a.length];//a�Ɠ����U�C�Y�̔z���p��
		
		for(int i=0;i<a.length;i++) b[i] = a[i];
		for(int i=0;i<a.length;i++) System.out.println(b[i]);
		
		/* a.length�Ŕz��a�̗v�f�����擾����ƈˑ����Ȃ� */
		//for���������ق������������m�ŗǂ�
		System.out.println(sum);
	}

}
