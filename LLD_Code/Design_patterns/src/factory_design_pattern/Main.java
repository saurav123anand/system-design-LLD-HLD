package factory_design_pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
