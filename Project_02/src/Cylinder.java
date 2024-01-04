public class Cylinder {
    private double r;
    private double h;
    private final double PI = Math.PI;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double surface(double r, double h) {
        return 2*PI*r*h + PI*r*r;
    }

    public double volume(double r) {
        return PI*r*r*h;
    }
}
