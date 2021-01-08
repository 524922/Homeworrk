package endTermHomeWork.homework12.connectionHomework.book;

import java.util.ArrayList;
import java.util.List;

public class BookTestList {
    public static void main(String[] args) {
        Book waterMargin = new Book();
        waterMargin.setName("WaterMargin");
        waterMargin.setNumber(1);
        waterMargin.setPress("ClassicPress");
        waterMargin.setPrince(99.9);

        Book JourneyToTheWest = new Book();
        JourneyToTheWest.setName("JourneyToTheWest");
        JourneyToTheWest.setNumber(2);
        JourneyToTheWest.setPress("ClassicPress");
        JourneyToTheWest.setPrince(99.9);

        Book aDreamInRedMansions = new Book();
        aDreamInRedMansions.setName("ADreamInRedMansions");
        aDreamInRedMansions.setNumber(3);
        aDreamInRedMansions.setPress("ClassicPress");
        aDreamInRedMansions.setPrince(99.9);

        Book RomansInThreeKingdoms = new Book();
        RomansInThreeKingdoms.setName("RomansInThreeKingdoms");
        RomansInThreeKingdoms.setNumber(4);
        RomansInThreeKingdoms.setPress("ClassicPress");
        RomansInThreeKingdoms.setPrince(99.9);

        List<Book> books=new ArrayList<>();
        books.add(waterMargin);
        books.add(aDreamInRedMansions);
        books.add(RomansInThreeKingdoms);
        books.add(JourneyToTheWest);

        //traversal
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Name:"+books.get(i).getName()
                    +" Number: "+books.get(i).getNumber()
                    +" Press: "+books.get(i).getPress()
                    +" Price "+books.get(i).getPrince());
        }
    }
}
