package endTermHomeWork.homework3.chapter3.p4;

public class p4 {
    public static void main(String[] args) {
        int a=(int)(Math.random()*12+1);
        String month="";
        switch (a){
            case 1:month="January";break;
            case 2:month="February";break;
            case 3:month="March";break;
            case 4:month="April";break;
            case 5:month="May";break;
            case 6:month="June";break;
            case 7:month="july";break;
            case 8:month="August";break;
            case 9:month="September";
            case 10:month="October";
            case 11:month="November";
            case 12:month="December";
        }
        System.out.println(month);
    }
}
