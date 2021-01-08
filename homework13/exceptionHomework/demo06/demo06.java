package endTermHomeWork.homework13.exceptionHomework.demo06;

import java.util.Scanner;

public class demo06 {
    /** Main method*/
    public static void main(String[] args) throws Exception {
        // Creat a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a String
        System.out.print("Enter a hex numbers: ");
        String hex = input.nextLine();

        try {
            System.out.print("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (!(ch >= '0' && ch <= '9') && !(ch >= 'A' && ch <= 'F'))
        {
            throw new NumberFormatException("输入字符串不是十六进制数，请重头再来");
        }
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else if (ch >= '0' && ch <= '9'){
            return ch - '0';
        }
        return 1;
    }
}
