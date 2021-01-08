package endTermHomeWork.homework13.exceptionHomework.demo07;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input binary number:");
        String s=input.next();
        try {
            Integer.parseInt(s,2);
        }catch (NumberFormatException e){
            System.out.println("Wrong!not a binary number");
            System.exit(1);
        }
        System.out.println("Decimal number:"+bin2Dec(s));
    }
    public static int bin2Dec(String bin){
        return Integer.parseInt(bin,2);
    }
}
