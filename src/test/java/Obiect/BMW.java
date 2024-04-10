package Obiect;

import java.util.List;

public class BMW extends Masina {

    private List<String> dotariInterioare;
    private List<String> dotariExterioare;

    private Integer pretFinal;
    public BMW(String marca, String model, String culoare, String carburant, Integer an,
               Integer capacitateCilindrica, Integer pret, List<String> dotariInterioare, List<String> dotariExterioareo) {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);

        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioareo;
    }

    public void prezentareBMW() {
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("pretul final este: " + pretFinal);
    }

    //polimorfism static
    public void afisarePret() {
        System.out.println(pretFinal);
    }

    public void afisarePret(Integer reducere) {
        System.out.println("Pret reducere: ");
    }

    public void afisarePret(String voucher) {
        System.out.println("Pret voucher: ");
    }


    public void calculDotari() {
        pretFinal = getPret();

        for (Integer index = 0; index < dotariExterioare.size(); index++) {
            switch (dotariExterioare.get(index)) {
                case "Faruri Led":
                    pretFinal += 70;
                    break;
                case "Oglinzi electrice":
                    pretFinal += 90;
                    break;
                case "camera video":
                    pretFinal += 110;
                    break;
            }
        }

        for (Integer index = 0; index < dotariInterioare.size(); index++) {
            switch (dotariInterioare.get(index)) {
                case "Incalzire Scaune":
                    pretFinal += 100;
                    break;
                case "Incalzire volan":
                    pretFinal += 190;
                    break;
                case "senzor parcare":
                    pretFinal += 80;
                    break;
            }
        }
    }

    public void pornesteMasina() {
        System.out.println("BMW se porneste de la distanta");
    }
}
