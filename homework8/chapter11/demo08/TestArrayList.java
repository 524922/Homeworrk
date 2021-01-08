package endTermHomeWork.homework8.chapter11.demo08;

import endTermHomeWork.homework8.chapter11.demo02.CircleFromSimpleGeometricObject;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.println("List Size:"+cityList.size());
        cityList.add(2,"Hangzhou");
        cityList.remove(1);
        System.out.println(cityList.toString());
        for (int i = cityList.size()-1; i >=0; i--) {
            System.out.println(cityList.get(i)+" ");
        }
        System.out.println();
        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));
        System.out.println("area:"+list.get(0).getArea());
    }
}
