package b2512.huangsai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("请输入一组字符串:");
        String  s = c.next();
        String a = "";
        char[] cs = s.toCharArray();
        for(int i = cs.length-1;i>=0;i--){
            // 单个字符
            // 如果变成大写后和原本的样子相等,则换为小写
            if(Character.isLowerCase(cs[i]))  //isLowerCase:方法用于判断指定字符是否为小写字母。
                //Character:用于对单个字符进行操作
                cs[i] = Character.toUpperCase(cs[i]);
            else
                cs[i] = Character.toLowerCase(cs[i]);
                a +=cs[i];
            }
        System.out.println(a);

        //第二种方法
//        Scanner c = new Scanner(System.in);
//        StringBuffer sbf = new StringBuffer();  //StringBuffer: 将此字符序列用其反转形式取代。
//        System.out.println("请输入一组字符串:");
//        String s = c.nextLine();
//        sbf.append(s);
//        sbf.reverse();
//        String sc = sbf.toString();
//        char[] cs = sc.toCharArray();
//        for(int i = cs.length-1;i>=0;i--){
//            // 单个字符
//            // 如果变成大写后和原本的样子相等,则换为小写
//            if(Character.toUpperCase(cs[i]) == cs[i])
//                cs[i] = Character.toLowerCase(cs[i]);
//            else
//                cs[i] = Character.toUpperCase(cs[i]);
//        }
//        System.out.println(cs);
    }
}
