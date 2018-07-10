
public class Classy2
{
    private int x;
    private int y;
    private int z;
    private String name,description;
    public Classy2(){
        this("default name");
    }

    public Classy2(String name){
        x = 42;
        y = 43;
        z = 44;
        this.name = name;

    }

    public Classy2(String name, String description){
        this(name);
        this.description = description;

    }

    public Classy2(int lastname){
        this("just a bogus example");

    }

    public static void play(){
        Classy2 c = new Classy2("some string");
    }
}
