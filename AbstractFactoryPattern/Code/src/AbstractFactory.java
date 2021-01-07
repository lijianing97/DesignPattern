/**
 * @author lijianing
 * @version 1.0
 * @date 2020/12/5 1:30
 */

 ///
public abstract class AbstractFactory {
    /**
     * 获取Color
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取Shape
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);
}
