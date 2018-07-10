
public class CastTest
{
    public static void play(){
        Object o = new Double(5);
        Double d = (Double)o;
        // yields ClassCastException
        //Integer i = (Integer)o;
        printClass(5);
        printClass(3.2);

    }

    public static void printClass(Object o){
        if (o instanceof Integer){
            Integer i = (Integer)o;
            System.out.println("found integer!"+i);
        }
        if (o instanceof Double){
            Double d = (Double)o;
            System.out.println("found double!"+d);
        }
    }
}
