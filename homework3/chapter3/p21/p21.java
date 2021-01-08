package endTermHomeWork.homework3.chapter3.p21;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year=scanner.nextInt();
        int month=scanner.nextInt();
        int day=scanner.nextInt();
        int j=Math.abs(year/100);
        int k=year%100;
        int h=(day+(26*(month+1))/10+k+k/4+j/4+5*j)%7;
        String week="";
        //String [] weeks={"Saturday"}
        switch (h){
            case 0:week="Saturday";break;
            case 1:week="Sunday";break;
            case 2:week="Monday";break;
            case 3:week="Tuesday";break;
            case 4:week="Wednesday";break;
            case 5:week="Thursday";break;
            case 6:week="Friday";break;
        }
        //System.out.println(h);
        System.out.println(week);

    }
}
