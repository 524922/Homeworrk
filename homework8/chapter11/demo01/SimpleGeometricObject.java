package endTermHomeWork.homework8.chapter11.demo01;

import java.util.Date;

public class SimpleGeometricObject {
    private String color="white";
    private boolean filled;
    private Date dataCreated;

    public SimpleGeometricObject(){
        dataCreated=new Date();
    }

    public SimpleGeometricObject(String color,boolean filled){
        dataCreated=new Date();
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public Date getDataCreated(){
        return dataCreated;
    }
    public void setDataCreated(Date dataCreated){
        this.dataCreated=dataCreated;
    }

    @Override
    public String toString() {
        return "SimpleGeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dataCreated=" + dataCreated +
                '}';
    }
}
