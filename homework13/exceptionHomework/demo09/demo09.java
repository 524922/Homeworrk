package endTermHomeWork.homework13.exceptionHomework.demo09;

import java.util.Scanner;

public class demo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a binary string:");
        String s=input.next();
        try {
            int i=bin2Dec(s);
            System.out.print(i);
        }catch (NumberFormatException e){
            System.out.println("wrong!\n"+e);
            System.exit(1);
        }
    }
    public static int bin2Dec(String hex) throws BinaryFormatException {
        int value=0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar=hex.charAt(i);
            if(hexChar=='0' || hexChar=='1'){
                value=value*2+hexChar-'0';
            }else {
                throw new NumberFormatException("not a binString");
            }
        }
        return value;
    }
}
