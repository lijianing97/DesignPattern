/**
 * @author lijianing
 * @version 1.0
 * @date 2020/12/5 1:42
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if("shape".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        } else if("color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
