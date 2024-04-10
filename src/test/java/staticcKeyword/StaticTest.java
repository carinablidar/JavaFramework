package staticcKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest() {
        Elev elev = new Elev("Carina", "Blidar");
        elev.prezentare();
        System.out.println();
        Elev elev2 = new Elev("Carina1", "Blidar1");
        elev2.prezentare();
    }
}
