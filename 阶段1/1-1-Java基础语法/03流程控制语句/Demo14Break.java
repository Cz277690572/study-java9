/*
break�ؼ��ֵ��÷��г��������֣�

1. ��������switch��䵱�У�һ��ִ�У�����switch�����������
2. ����������ѭ����䵱�У�һ��ִ�У�����ѭ������������������ѭ��

����ѭ����ѡ����һ��С����
���Ǵ���ȷ���ĳ�������forѭ�����������whileѭ��
*/
public class Demo14Break {
	public static void main(String[] args) {
		// �ӵ�4�ο�ʼ������ȫ����Ҫ�ˣ����ѭ��
		for (int i = 1; i <= 10; i++) {
			if(i == 4) {
				break;
			}
			System.out.println("Hello: "+i);
		}
	}
}