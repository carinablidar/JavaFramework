package AbstractizareInterfata;

public class PersoanaAngajat extends Persoana implements Angajat{


    public PersoanaAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void prezentaBirou() {
        System.out.println("Angajatul merge la birou");
    }

    @Override
    public void pauza() {
        System.out.println("Anagaatul isi ia pauza de masa");
    }

    @Override
    public void incasatSalariu() {
        System.out.println("Anagajatul incaseaza salariul");
    }
}
