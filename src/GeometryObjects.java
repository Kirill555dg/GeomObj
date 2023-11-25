public abstract class GeometryObjects implements Comparable<GeometryObjects>{

    abstract double getSquare();
    abstract void setScale(double scale);

    @Override
    public String toString() {
        return ", Square=" + getSquare();
    }

    @Override
    public int compareTo(GeometryObjects o) {
        if (this.getSquare() > o.getSquare()) {
            return 1;
        } else if (this.getSquare() < o.getSquare()) {
            return -1;
        }
        return 0;
    }
}
