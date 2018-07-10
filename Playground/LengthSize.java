import java.util.*;
public class LengthSize
{
    public static void play(){
        int[] a = {1,2,3,4};
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("array" + a.length);
        System.out.println("arraylist" + al.size());

        String s = "hello";
        System.out.println("true: "+s.contains("h"));
        System.out.println("false: "+s.equals("h"));
        System.out.println("true: "+s.equals("hello"));
        al.add(1);al.add(2);
        System.out.println("true: "+al.contains(1));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);list2.add(2);
        System.out.println("true"+ al.equals(list2));
        list2.add(3);
        System.out.println("false"+ al.equals(list2));

    }
}
