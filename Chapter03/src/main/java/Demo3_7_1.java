/**
 * @Author: L.N
 * @Date: 2023/6/22 14:29
 * @Description:
 */
public class Demo3_7_1 {

}
//3.7.1 实现算术计算
//声明两个变量，用来存储2个整数，如1或2.使用算术运算符来求这两个整数的和，差，积，商，余数
class ArithmeticDemo{

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
        System.out.println("a / b = " + (double)a / b);
        System.out.println("a % b = " + a % b);

    }
}

//3.7.2 求一个三位数字各个位数上的和
//声明一个变量，用来存储一个三位数的整数，请求出它各个位数上的和 例如1,2,3各个位数之和是1+2+3 = 6
class EachDigitSumDemo{
    public static void main(String[] args) {
        int num = 123;
        System.out.println( num + "各个位数之和是" + EachSum1(num));
    }

    public static int EachSum1(int num){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

//3.7.3 交换2个变量的值
//声明两个变量 ，用来存储2个整数，如1和2现在请交换两个变量中的值
class SwapVariableDemo1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        test1(a, b);
        test2(a, b);

    }

    public static void test1(int a ,int b){
        System.out.println("交换之前的值：a = "+ a + ",b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换之后的值：a = "+ a + ",b = " + b);
    }

    public static void test2(int a ,int b){
        System.out.println("test2");
        System.out.println("交换之前的值：a = "+ a + ",b = " + b);

        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("交换之后的值：a = "+ a + ",b = " + b);
    }
}
//判断是否是润年
class LeapYearDemo {
    public static void main(String[] args) {
        int year = 2021;
        boolean flag = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(year + (flag ? "是润年":"是平年"));
    }
}

//将小写字母转为对应的大写字母
class ToUpperCaseDemo{
    public static void main(String[] args) {
        char letter = 'a';
        char upperCase = (char)(letter -32);
        System.out.println(letter+"对应的大写字母是" + upperCase );
    }
}
