package b2512.liwenjian;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner Six=new Scanner(System.in);
        System.out.println("请输入任意长度字符串：");
        String Length=Six.next();
        String COOL= ""; //字符串
        char[] Sixstring=Length.toCharArray();//转换为数组
        for(int i=Length.length()-1;i>=0;i--){
            if(Sixstring[i]>=65&&Sixstring[i]<=90){ //大写转小写 A=65 Z=90 z=122 a=97
                Sixstring[i]+=32;
            }else if (Sixstring[i]>=97&&Sixstring[i]<=122){//如果是小写字母则实现else条件的语句
                Sixstring[i]-=32;
            }
            COOL += Sixstring[i];//接收字符串
        }
        System.out.println (COOL);
    }
}
