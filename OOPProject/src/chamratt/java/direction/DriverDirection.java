package chamratt.java.direction;

public class DriverDirection {
//    public static void  printDirection(Direction direction){
//        direction.showDirection();
//    }
    public static <T extends Enum<T> & Direction> void printDirection(Class<T> tClass)
    {
        for (Direction direction : tClass.getEnumConstants())
        {
            direction.showDirection();
        }
    }
}
