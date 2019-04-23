package cn.itcast.day05.demo03;

public class Demo06ArrayMin {

    public static void main(String[] args) {
        int[] array = { 5, 15, 30, 20, 100, -20, 3, 35};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}
