package b2512.zhangguihong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int max;
//        int min;
//        int middle;
//        System.out.println("请输入a的值");
//        int a=scan.nextInt();
//        System.out.println("请输入b的值");
//        int b=scan.nextInt();
//        System.out.println("请输入c的值");
//        int c=scan.nextInt();
//        System.out.println(a+""+""+b+""+c);
//        max=Math.max(a,b);
//        max=Math.max(max,c);
//        min=Math.min(a,b);
//        min=Math.min(min,c);
//        middle=(a+b+c)-(max+min);

            //demoMath06
            //输入任意长度字符串,可以输入数字和英文字母
            //然后字符串的头尾顺序颠倒,英文字母大小写颠倒

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
