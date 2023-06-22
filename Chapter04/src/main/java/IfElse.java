import java.util.Scanner;

/**
 * @Author: L.N
 * @Date: 2023/6/23 0:50
 * @Description: 分支结构之 if...else
 */
public class IfElse {

}

//2月份的总天数
//用键盘输入一个年份，输出该年2个月的总天数
class DaysOfFebruaryDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        if (year % 4 == 0 &&year % 100 != 0 || year % 400 == 0){
            System.out.println(year +"的二月份有" +29+"天");
        }else{
            System.out.println(year +"的二月份有" +28+"天");
        }
    }
}
//4.2.6征婚
class MarryHimDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("身高 ：");
        float height = input.nextFloat();
        System.out.print("资产 ：");
        int money = input.nextInt();
        System.out.print("帅吗？");
        Boolean isHandsome = input.nextBoolean();

        if (isHandsome){
            System.out.println("我一定要嫁给他");
        } else if (money >= 1000){
            System.out.println("还不错，至少衣食无忧");
        } else if (height >= 180){
            System.out.println("嫁吧，比上不足比下有余");
        } else {
            System.out.println("不嫁");
        }
    }
}
// 解方程
class EquationTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = input.nextInt();
        System.out.println("请输入b的值");
        int b = input.nextInt();
        System.out.println("请输入c的值");
        int c = input.nextInt();

        if ( a != 0){
            double der = b * b - 4 * a * c;
            if (der > 0){
                System.out.print("一元二次方程有2个不同的实数解x1 = " + (-b + Math.sqrt(der)) / (2 * a)+", x2 ="
                        + (-b - Math.sqrt(der)) / (2 * a));
            } else if ( der == 0){
                System.out.println("一元二次方程有2个相同的实数解 ：x = " + -b / 2 / a);
            } else{
                System.out.println("一元二次方程实数范围内无解");
            }
        } else if (a == 0 && b != 0){
            System.out.println("x = " + -c / b);
        } else{
            System.out.println("参数输入有误，无法构成方程");
        }

    }
}