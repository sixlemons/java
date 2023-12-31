/**
 * @Author: L.N
 * @Date: 2023/6/21 23:42
 * @Description:
 */
//变量的声明与使用
public class VarDemoTest {
    public static void main(String[] args) {
        int age = 18;
        double weight = 102.5;

        System.out.println("age = " +age);
        System.out.println("weight = " + weight);
    }
}
//变量的注意事项 ： 先声明后使用
//Error : 找不到符号
class TestVarDemo1{
    public static void main(String[] args) {
//        System.out.println( num);
//        int num = 18;
    }
}

//变量必须在初始化之后才能使用
//Error: 可能尚未初始化变量num
class TestVarDemo2{
    public static void main(String[] args) {
//        int num;
//        System.out.println(num);
    }
}

//变量有作用域，并且在同一个作用域中不可以重复命名
//Error:(38, 13) java: 已在方法 main(java.lang.String[])中定义了变量 num
// Error:(43, 28) java: 找不到符号
class TestVarDemo3{

    public static void main(String[] args) {
//        int num = 100;
//        int num = 99;
//        System.out.println(num);
    }

    public static void otherMethod(){
//        System.out.println(num);
    }
}

//变量的值可以变化，但是必须在变量声明的数据类型范围内。
//Error: 不兼容的类型: 从double转换到int可能会有损失
class TestVarDemo4{
    public static void main(String[] args) {
//        int num = 100;
//        num = 1.5;
//        System.out.println(num);
    }
}

class TestChapter{
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\"';
        char c3 = '\u0043';
        char c4 = 100;
        System.out.println("c1 = " + c1);   //c1 = a
        System.out.println("c2 = " + c2);   //c2 = "
        System.out.println("c3 = " + c3);   //c3 = C
        System.out.println("c4 = " + c4);   //c4 = d
    }
}

class MyInfoDemo{
    public static void main(String[] args) {
        String name = "谷姐";
        String school = "谷粒学院";
        int age = 18;
        char gender = '女';
        int height = 168;
        double weight = 102.5;
        boolean marry = false;
        System.out.println("name = " + name);
        System.out.println("school = " + school);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("height = " + 168);
        System.out.println("weight = " + weight);
        System.out.println("marry = " + marry);

    }
}
