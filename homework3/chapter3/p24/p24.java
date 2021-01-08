package endTermHomeWork.homework3.chapter3.p24;

public class p24 {
    public static void main(String[] args) {
        String[] size = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] color={"Clubs","Diamonds","Hearts","Spades"};
        int num1=(int)(Math.random()*12+1);
        int num2=(int)(Math.random()*4+1);
        System.out.println("The card you picked is "+size[num1]+" of "+color[num2]);
    }
}
