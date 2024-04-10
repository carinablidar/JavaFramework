package AbstractizareInterfata;

import org.testng.annotations.Test;

public class InterfataTest {

    @Test
    public void testMethod() {

        PersoanaStudent Carina = new PersoanaStudent("Carina", "Blidar", 28);
        PersoanaAngajat Roxana = new PersoanaAngajat("Roxana", "Blidar", 25);
        PersoanaStudentAngajat Carina2 = new PersoanaStudentAngajat("Carina2", "Blidar", 23);
    }
}
