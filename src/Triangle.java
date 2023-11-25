public class Triangle extends GeometryObjects{
    double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                super.toString() +
                '}';
    }

    @Override
    public double getSquare() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    void setScale(double scale) {
        a *= scale;
        b *= scale;
        c *= scale;
    }
}
