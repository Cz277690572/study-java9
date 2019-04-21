package cn.itcast.day04.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数
例如两个数字相加，必须知道两个数字各自是多少，才能相加

无参数：小括号当中流空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
例如定义个方法，打印固定10次HelloWorld
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        System.out.println("===============");
        method2();
    }

    public static void method1(int a, int b){
        System.out.println("结果是：" + (a + b));
    }

    public static void method2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, World!" + i);
        }
    }
}
