public class Circle extends GeometryObjects{

    double R;

    public Circle(double r) {
        R = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                super.toString() +
                '}';
    }

    @Override
    public double getSquare() {
        return Math.PI*R*R;
    }

    @Override
    void setScale(double scale) {
        R*= scale;
    }
}
