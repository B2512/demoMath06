package b2512.yeqingnan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //demoMath06
        //输入任意长度字符串,可以输入数字和英文字母
        //然后字符串的头尾顺序颠倒,英文字母大小写颠倒
        Scanner sc = new Scanner(System.in);
        System.out.print("输入任意长度字符串:");
        String str = sc.next();
        char[] ch = str.toCharArray();
        String result="";
        for (int i = ch.length - 1; i >= 0; i--) {
            //如果是小写的字母就转成大写
            if (Character.isLowerCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            }else  {
                //否则大转小
                ch[i] = Character.toLowerCase(ch[i]);
            }
            result+=String.valueOf(ch[i]);
        }
        System.out.println(result);
    }
}
