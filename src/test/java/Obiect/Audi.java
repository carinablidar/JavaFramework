package Obiect;

import java.util.List;

public class Audi extends Masina {

    private List<String> dotariExterioare;
    private Integer pretFinal;


    public Audi(String marca, String model, String culoare, String carburant, Integer an,
                Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi() {

        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final este: " + pretFinal);
        System.out.println("Dotarile esterioare sunt: " + dotariExterioare);
    }

    public void calculDotari() {
        pretFinal = getPret();

        for (Integer index = 0; index < dotariExterioare.size(); index++) {
            switch (dotariExterioare.get(index)) {
                case "Faruri Led":
                    pretFinal += 100;
                    break;
                case "Oglinzi electrice":
                    pretFinal += 120;
                    break;
                case "camera video":
                    pretFinal += 130;      //pretfinal = pret final + 130
                    break;
            }
        }
    }

    public void pornesteMasina() {
        System.out.println("Audi se porneste de la buton");
    }
}
