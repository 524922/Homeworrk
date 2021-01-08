package endTermHomeWork.homework4.chapter7.p24;

import java.util.Random;
import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 10000;
        String[] hs = new String[maxn];
        int[] tool = new int[maxn];
        String[] sz = new String[maxn];
        for(int i = 0;i < 4;++ i){
            tool[i] = 0;
        }
        for(int i = 0;i < 4;++ i){
            if(i==0) hs[i] = "Spades";
            else if(i==1) hs[i] = "Clubs";
            else if(i==2) hs[i] = "Hearts";
            else if(i==3) hs[i] = "Diamonds";
        }
        for(int i = 1;i<=13;++i){
            if(i == 1) sz[i] = "A";
            else if(i==2) sz[i] = "2";
            else if(i==3) sz[i] = "3";
            else if(i==4) sz[i] = "4";
            else if(i==5) sz[i] = "5";
            else if(i==6) sz[i] = "6";
            else if(i==7) sz[i] = "7";
            else if(i==8) sz[i] = "8";
            else if(i==9) sz[i] = "9";
            else if(i==10) sz[i] = "10";
            else if(i==11) sz[i] = "Jack";
            else if(i==12) sz[i] = "Queen";
            else if(i==13) sz[i] = "King";
        }
        Random r = new Random();
        int n = 0;
        int m = 0;
        while(n<4){
            int a = 1 + r.nextInt(13);
            int b = r.nextInt(4);
            if(tool[b] == 0){
                System.out.println(sz[a]+" of "+hs[b]);
                tool[b]++;
                n++;
            }
            m++;
        }
        System.out.println("Number of picks : "+m);
    }
}
