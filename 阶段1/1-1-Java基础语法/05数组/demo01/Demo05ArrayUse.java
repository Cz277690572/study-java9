package cn.itcast.day05.demo01;

/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
*/
public class Demo05ArrayUse {

    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array); // 内存地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("============");

        // 将数据123赋值交给数据array当中的1号元素
        array[1] = 123;
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 123
        System.out.println(array[2]); // 0
    }
}
