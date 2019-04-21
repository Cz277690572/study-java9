package cn.itcast.day04.demo04;

public class Demo03OverloadJude {

    public static void main(String[] args) { }


    public static void open(){} // 正确重载
    public static void open(int a){} // 正确重载
//    static void open(int a, int b){} // 代码错误，与第14行代码冲突
    public static void open(double a, int b){} // 正确重载
//    public static void open(int a, double b) {} // 代码错误，与第13行代码冲突
//    public void open(int i, double d){} // 代码错误，和第12行
//    public static void open(int i, int j){} // 代码错误，与第10行冲突
}
