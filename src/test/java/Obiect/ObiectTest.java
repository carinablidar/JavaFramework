package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {

    @Test
    public void metodaTest() {

        List<String> dotariExterioareAudi = Arrays.asList("Faruri Led", "Oglinzi electrice", "camera video");

        Audi AudiPrimavera = new Audi("Audi", "A1", "negru",
                "motorina", 2020, 1999, 1200, dotariExterioareAudi);

        AudiPrimavera.setCuloare("albastru");
        AudiPrimavera.definireImpozit();
        AudiPrimavera.prezentareAudi();
        AudiPrimavera.pornesteMasina();
        System.out.println();


        List<String> dotariInterioareBMW = Arrays.asList("Incalzire Scaune", "Incalzire volan", "senzor parcare");
        List<String> dotariExterioareBMW = Arrays.asList("Faruri Led BMW", "Oglinzi electrice BMW", "camera video BMW");

        BMW BMWModel = new BMW("BMW", "X5", "alb",
                "benzina", 2022, 1998, 1500, dotariInterioareBMW, dotariExterioareBMW);
        BMWModel.prezentareBMW();
        BMWModel.definireImpozit();
        BMWModel.pornesteMasina();
        System.out.println();
        BMWModel.afisarePret();
        BMWModel.afisarePret(100);
        BMWModel.afisarePret("Craciun");




//        Masina Toyota = new Masina("Toyota", "Prius","Gri", "disel", 2023, 2000, 500);
//        Toyota.prezentareMasina();
//        Toyota.definireImpozit();
//        System.out.println();

    }
}
