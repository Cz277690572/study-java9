package cn.itcast.day04.demo02;
/*
方法定义格式
public static void 方法名() {
    方法体
}

调用格式
方法名称();

注意事项
1. 方法定义的先后顺序无所谓
2. 方法定义必须是挨着的，不能再一个方法的内部定义另一个方法
3. 方法定义之后，自己不会执行，如果希望执行，一定要进行方法的调用
*/
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod()
    {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
