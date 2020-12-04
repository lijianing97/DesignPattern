/**
 * @author lijianing
 * @version 1.0
 * @date 2020/12/5 1:32
 */

public class ShapeFactory extends AbstractFactory {
    String CIRCLE = "circle";
    String SQUARE = "square";
    String RECTANGLE = "rectangle";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(CIRCLE.equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if(RECTANGLE.equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if(SQUARE.equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
