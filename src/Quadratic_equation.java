public class Quadratic_equation {
private int a;
private int b;
private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant(){
       return Math.pow((double) b,2.0) -4*a*c;

    }

    public double getRoot1(){
        return (((-b - Math.sqrt(this.getDiscriminant()))/(2*a)));
    }
    public double getRoot2(){
        return (((-b + Math.sqrt(this.getDiscriminant()))/(2*a)));
    }

    public Quadratic_equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
