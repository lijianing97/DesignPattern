package com.walkindaynight;

/**
 * @author lijianing
 * @version 1.0
 * @date 2020/12/5 0:41
 */

public class ShapeFactory {
    String CIRCLE="circle";
    String RECTANGLE="rectangle";
    String SQUARE="square";
    /**
     * 根据类型生成对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
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
