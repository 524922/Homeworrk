package endTermHomeWork.homework13.exceptionHomework.demo08;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter a hex string:");
            HexToDecUseHexFormatException hex=new HexToDecUseHexFormatException(input.next());
            System.out.println("the decimal value for hex number:"+hex.getHexString());
        }catch (HexFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
}
