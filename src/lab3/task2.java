package lab3;

public class task2 {
    public static void main(String[] args){
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.71");
        String doubleString="6.28";
        double doubleValue=Double.parseDouble(doubleString);
        double primitiveDouble = doubleObject1.doubleValue();
        int primitiveInt = doubleObject1.intValue();
        float primitiveFloat = doubleObject1.floatValue();
        long primitiveLong = doubleObject1.longValue();
        byte primitiveByte = doubleObject1.byteValue();
        short primitiveShort = doubleObject1.shortValue();
        boolean primitiveBoolean = doubleObject1.isNaN();
        System.out.println("Значение doubleObject1: " + doubleObject1);
        System.out.println("Значение doubleObject2: " + doubleObject2);
        String doubleToString = Double.toString(3.14);
        System.out.println("Преобразованное значение 3.14 к строке: " + doubleToString);
    }
}
