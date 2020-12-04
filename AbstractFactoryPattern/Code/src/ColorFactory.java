/**
 * @author lijianing
 * @version 1.0
 * @date 2020/12/5 1:37
 */

public class ColorFactory extends AbstractFactory {
    String RED = "red";
    String GREEN = "green";
    String BLUE = "blue";
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(RED.equalsIgnoreCase(color)){
            return new Red();
        } else if(GREEN.equalsIgnoreCase(color)){
            return new Green();
        } else if(BLUE.equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
