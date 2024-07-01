package AbstractizareInterfata;

public class PersoanaStudentAngajat extends Persoana implements Student, Angajat{
    public PersoanaStudentAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta, rating, nationalitate);
    }

    @Override
    public void prezentaCurs() {

    }

    @Override
    public void examinare() {

    }

    @Override
    public void studiat() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void prezentaBirou() {

    }

    @Override
    public void pauza() {

    }

    @Override
    public void incasatSalariu() {

    }
}
