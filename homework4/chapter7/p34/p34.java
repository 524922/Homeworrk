package endTermHomeWork.homework4.chapter7.p34;

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 10000;
        String a = input.nextLine();
        int n = a.length();
        System.out.println(sort(a));
    }
    public static String sort(String s){
        int n = s.length();
        char[] b = s.toCharArray();//把字符串转换成字符数组
        for(int i = 0;i < n-1;++ i){
            for(int j = 0;j < n-1-i;++j){
                if(b[j] > b[j+1]){
                    char tool = b[j+1];
                    b[j+1] = b[j];
                    b[j] = tool;
                }
            }
        }
        String s1 = String.valueOf(b);//把数组转成字符串
        return s1;
    }
}
