package cn.itcast.day04.demo03;

/*
题目要求：
定义一个方法，用来打印指定次数的hello, world。
* */
public class Demo03MethodPrint {

    public static void main(String[] args) {
        printCount(10);
    }

    public static void printCount(int count) {
        int i = 0;
        while (i < count) {
            System.out.println("Hello, world!" + (i + 1));
            i++;
        }
    }
}
