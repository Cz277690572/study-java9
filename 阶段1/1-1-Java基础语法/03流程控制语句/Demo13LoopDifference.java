/*
����ѭ��������

1. ��������ж�����û�����������ôforѭ�����whileѭ������ִ��0�Σ�����do-while��ִ������һ��.
2. forѭ���ı�����С���ŵ��ж��壬ֻ��ѭ���ڲ��ſ���ʹ�á�whileѭ����do-whileѭ����ʼ����䱾���������棬���Գ���ѭ��֮�󻹿��Լ���ʹ��
*/
public class Demo13LoopDifference {
	public static void main(String[] args){
		for (int i = 1; i < 0; i++) {
			System.out.println("Hello");
		}
		// System.out.println(i); // ��һ�е�д���Ǵ���ģ���Ϊ����i������forѭ��С�����ڣ�ֻ��forѭ���Լ�������
		
		int i = 1;
		do {
			System.out.println(i); // 1
			i++;
		} while(i < 0);
		// �����Ѿ�������do-whileѭ���ķ�Χ��������Ȼ����ʹ�ñ���i
		System.out.println(i); // 2
	}
}