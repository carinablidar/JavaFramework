package AbstractizareClasaAbstracta;

public abstract class Persoana {

    //o clasa avbstracta se recunoaste dupa cuvanta "abstract"
    //o clasa abstracta poate, sau nu sa contina metode abstracte
    //putem mosteni o singura clasa abstracta
    //intr-o clasa abstracta putem avea un constructor => nu poti face un obiect
    //o casa abstracta poate sa implementeze o interfata
    //o metoda abstracta trebuie sa contina cuvantul "abstract"

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    //metoda cu bady
    public void prezentare() {
        System.out.println("metoda cu bady");
    }

    //definesc metodele pt ambele comportamente
    public abstract void munceste();
    public abstract void prezentaBirou();
    public abstract void pauza();
    public abstract void incasatSalariu();

    public abstract void prezentaCurs();
    public abstract void examinare();
    public abstract void studiat();
}
