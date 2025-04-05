package factory_design_pattern;

public class ShapeFactory {
    public Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
