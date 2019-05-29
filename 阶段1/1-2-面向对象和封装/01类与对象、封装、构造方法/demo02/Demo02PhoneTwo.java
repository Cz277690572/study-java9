package cn.itcast.day06.demo02;

public class Demo02PhoneTwo {

    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand);  // null
        System.out.println(one.price);  // 0.0
        System.out.println(one.color);  // null
        System.out.println("==========");

        one.brand = "苹果x";
        one.price = 8399.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("============");

        one.call("乔布斯");  // 给乔布斯打电话
        one.sendMessage();         // 群发短信
        System.out.println("============");

        Phone two = new Phone();
        System.out.println(two.brand);  // null
        System.out.println(two.price);  // 0.0
        System.out.println(two.color);  // null
    }

}
