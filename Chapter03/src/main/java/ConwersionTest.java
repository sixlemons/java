/**
 * @Author: L.N
 * @Date: 2023/6/22 1:33
 * @Description:类型转换
 */

//public class ConwersionTest{
//    public static void main(String[] args) {
//
//    }
//}
class Wideding_Conversion {
    public static void main(String[] args) {
        byte a = 127;
        char b = 'f';
        short c = 32767;
        int d = a + b + c;
        System.out.println(d);//32969 自动类型类型转换
        String school = "科院";
        String e = school + a + b + c ;//科院127f32767
        System.out.println(e);
        String f = a + b + c +school;//32996科院
        System.out.println(f);
    }
}
//强制类型转换
class Narrow_Conversion{
    public static void main(String[] args) {
        int num = 98;
        short s = (short)num;
        System.out.println(s);//结果：98

        double d = 9.95;
        int i = (int)d;
        System.out.println(i); //结果9

        byte bValue = (byte)255;
        System.out.println(bValue);
    }
}
