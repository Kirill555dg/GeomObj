public class Rectangle extends GeometryObjects{

    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                super.toString() +
                '}';
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    void setScale(double scale) {
        a *= scale;
        b *= scale;
    }
}
