import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Author: L.N
 * @Date: 2023/6/22 22:05
 * @Description: 顺序结构
 */
public class InputOutput {

}
//顺序结构的特点：从上到下执行
class TestStatement{
    public static void main(String [] args){
        int x = 1;
        int y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        y = x * 2 + y;
        x = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

class TestInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        System.out.println(num);
    }
}

class InputInfoDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = input.next();
        System.out.println("请输入年龄");
        int age = input.nextInt();
        System.out.println("请输入体重");
        double weight = input.nextDouble();
        System.out.println("请输入婚否");
        boolean marry = input.nextBoolean();
        System.out.println("请输入性别");
        char gender = input.next().charAt(0);
        System.out.println("姓名" + name);
        System.out.println("年龄" + age);
        System.out.println("体重" + weight);
        System.out.println("婚否" + (marry ?"已婚":"未婚"));
        System.out.println("性别" + gender);

    }
}