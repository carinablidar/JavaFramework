package Obiect;

public class Masina {

    //constructor = are ca rol sa initializeze var unei clase
    //putem recunoaste un constructor dupa numele clasei
    //de cele mai multe ori constructorul este publuic
    //exista 2 tipuri de constructior: cu parametrii sau fara parametrii
    //intr-o clasa java exista un constructor default fara parametrii
    //obiect = instanta unei clase
    //dintr-o clasa putem instantia "n" obiecte
    //obiectele se diferentiaza prin numele lor sau prin nr de parametri pe care ii primesc
    //in momentul cand un obiect primeste valori (se initializeaza) se apeleaza constructorul din clasa

    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private Integer an;
    private Integer capacitateCilindrica;
    private Integer pret;



    //exista 4 concepte OOP: mostenire, incapsulare, abstractizare si polimorfism
    //mostenire = conceptul prin care o clasa este mostenita (extinsa) de o alta clasa
    //cand o clasa mostenete o alta clasa se formeaza o relatie de parinte - copil
    //in java o clasa poate mosteni doar o singura clasa
    //cand se aplica mostenirea, copilul poate accesa toate var/metodele din parinte, daca sunt public/protected
    //in momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte cu "super"


    //incapsulare = conceptul prin care excludem posibilitatea ca unele informatii sa fie mofiicate din exteriorul clasei
    //access control in java: public, private, protected si default
    //public = ofera vizibilitate in toate pachetele din proiect
    //private = restrange vizibilitatea doar in clasa unde este definit
    //ca sa oferim vizibilitate proprietatilor in alte clase apelam la conceputl getter/setter


    //polimorfism = conceptul prin care o metoda poate avea implementari diferite
    //polimorfismul  e de 2 feluri: dinamica(overrride) si static(overload)
    //polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfismul dinamic se regaseste tot timpul in procesul de mostenire
    //polimorfismul static = posibilitatea prin care o metoda cu acelasi nume sa fie implementata de mai multe ori
    //diferentierea dintre aceste metode s-ar face prin nr sau tipul de paramentrii
    //polimorfismul static se poate aplica doar la metodele cu void



    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica) {

        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
    }


    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }

    //defini prima implementare pt o metoda pe care o vom suprascrie
    public void pornesteMasina() {
        System.out.println("Masina porneste de la cheie");
    }

    public void prezentareMasina() {

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masini este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Carburantul este: " + carburant);
        System.out.println("Anul fabricatiei este: " + an);
        System.out.println("Capacitatea Cilindrica este: " + capacitateCilindrica);
        //System.out.println("Pretul este: " + pret);

        if (pret != null) {
            System.out.println("Pretul initial este: " + pret);
        }
        else {
            System.out.println("Masina este gratis");
        }
    }

    //daca  >= 2023 => 5 lei
    //daca 2020 - 2022 => 10 lei
    //daca 2020 => 20 lei
    public void definireImpozit() {

        if (an >= 2023) {
            System.out.println("Pentru " + marca + "din anul " + an + " Impozitul este: 5 lei");
        }
        else if (an > 2020 && an < 2023) {
            System.out.println("Pentru " + marca + "din anul " + an + " Impozitul este: 10 lei");
        }
        else if (an == 2020) {
            System.out.println("Pentru " + marca + "din anul " + an + " Impozitul este: 20 lei");
        }
        else {
            System.out.println("Nu mai platesti impozit");
        }
    }


    //facem getter/setter
    //click dreapta -> generate -> getter or setter

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public Integer getAn() {
        return an;
    }

    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAn(Integer an) {
        this.an = an;
    }


}