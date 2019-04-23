package cn.itcast.day05.demo03;

public class Demo05ArrayMax {

    public static void main(String[] args) {
        int[] array = {5, 15, 0, 20, 10000, 30, 35};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("最大值" + max);
    }
}
