package b2512.wuzhangjie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        StringBuffer buffer = new StringBuffer();
        System.out.print("输入任意长度字符串:");
        String str = scan.next();
        char[] ch = str.toCharArray();
        String result = "";
        for (int i =ch.length-1;i>=0;i--){
            if (Character.isLowerCase(ch[i])){//如果是小写字母则实现if条件的语句
                //Character类提供了一系列方法来操纵字符
                //isLowerCase() 方法用于判断指定字符是否为小写字母。
                ch[i]=Character.toUpperCase(ch[i]);
                //toUpperCase()方法进行字母大小写判断并转化
            }else if(Character.isUpperCase(ch[i])){//如果是大写字母则实现else if下的语句
                //isUpperCase() 方法用于判断指定字符是否为大写字母。
                //toLowerCase() 方法用于将大写字符转换为小写。
                ch[i]=Character.toLowerCase(ch[i]);
            }
//            buffer.append(ch[i]);//是往动态字符串数组添加
            result += String.valueOf(ch[i]);//result吸收字符
        }
//        buffer = buffer.reverse();//java字符串反转
        System.out.println(result);

//        Scanner Six=new Scanner(System.in);
//        System.out.println("请输入任意长度字符串：");
//        String Length=Six.next();
//        String pic= "";
//        char[] Sixstring=Length.toCharArray();
//        for(int i=Length.length()-1;i>=0;i--){
//            if(Sixstring[i]>=65&&Sixstring[i]<=90){
//                Sixstring[i]+=32;
//            }else if (Sixstring[i]>=97&&Sixstring[i]<=122){//如果是小写字母则实现else条件的语句
//                Sixstring[i]-=32;
//            }
//            pic += String.valueOf(Sixstring[i]);
//        }
//        System.out.println (pic);
    }
}
