import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FoxTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FoxTest
{
    /**
     * Default constructor for test class FoxTest
     */
    public FoxTest()
    {
    }

    @Test
    public void testFox(){
        Fox f = new Fox();
        f.draw();

        Drawable d = new Fox();
        d.draw();
        d = new Rabbit();
        d.draw();

        ArrayList<Drawable> visibleAnimals = new ArrayList<>();
        visibleAnimals.add(new Fox());
        visibleAnimals.add(new Stone());
        visibleAnimals.add(new Rabbit());
        // doesn't work - ants are not drawable visibleAnimals.add(new Ant());
        for(Drawable a : visibleAnimals){
            a.draw();}
    }
}
