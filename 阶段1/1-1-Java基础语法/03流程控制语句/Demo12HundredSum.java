/*
��Ŀ�����1-100֮���ż����
*/

public class Demo12HundredSum {
	public static void main(String[] args) {
		
		int num = 1;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				num += i;
			}
		}
		System.out.println(num);
	}
}