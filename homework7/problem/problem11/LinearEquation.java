package endTermHomeWork.homework7.problem.problem11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double x;
    private double y;
    public LinearEquation(){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
//        this(a,b,c,d,e,f);
    }
    public double getA(){
        return this.a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        if((a*d-b*c)!=0) return true;
        else return false;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
