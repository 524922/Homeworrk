package endTermHomeWork.homework12.connectionHomework.book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookTestMap {
    public static void main(String[] args) {
        Map<String, Book> books=new HashMap<String, Book>();
        books.put("1",new Book("WaterMargin",1,99.8,"HelloPress"));
        books.put("2",new Book("JourneyToTheWest",2,99.8,"HelloPress"));
        books.put("3",new Book("ADreamInRedMansions",3,99.5,"HelloPress"));
        books.put("4",new Book("RomansInThreeKingdoms",4,99.5,"HelloPress"));

        Iterator iterator=books.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry) iterator.next();
            System.out.println(" Number: "+entry.getKey()+
                    " Name: "+((Book)entry.getValue()).getName()+
                    " Price: "+((Book)entry.getValue()).getPrince()+
                    " Press "+((Book)entry.getValue()).getPress());
        }

    }
}
