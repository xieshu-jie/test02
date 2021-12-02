package study;

public class Equals {

    public static void main(String[] args) {
       /* //双等号比较的内存地址,equals比较的是数值
        String x = "java";
        String y = "java";
        String z = new String("java");
        System.out.println(x==y);//true
        System.out.println(x==z);//false
        System.out.println(x.equals(y));//true
        System.out.println(x.equals(z));//true*/

        String a = "12";
        String b = "1"+2;
        System.out.println(b);
        System.out.println(a==b);



    }
}
