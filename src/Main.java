import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometryObjects[] go = new GeometryObjects[]{new Rectangle(3,4), new Triangle(3,4,5), new Circle(5)};
        Arrays.sort(go);
        System.out.println(Arrays.toString(go));
        go[0].setScale(3);
        System.out.println(Arrays.toString(go));
    }
}