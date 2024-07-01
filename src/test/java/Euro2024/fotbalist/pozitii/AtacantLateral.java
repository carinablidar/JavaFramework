package Euro2024.fotbalist.pozitii;

import Euro2024.antrenor.AntrenorInterfata;
import Euro2024.fotbalist.Fotbalist;

public class AtacantLateral extends Fotbalist implements AntrenorInterfata {
    public AtacantLateral(String nume, String prenume, Integer varsta, Integer oras, Double rating,
                          String nationalitate, Integer pozitieTeren, Integer nrTricou, String club, String nationala, Boolean esteCapitan, Boolean esteArbitru) {
        super(nume, prenume, varsta, oras, rating, nationalitate, pozitieTeren, nrTricou, club, nationala, esteCapitan, esteArbitru);
    }

    @Override
    public void strategieAntrenanment() {

    }

    @Override
    public void selectionare() {

    }

    @Override
    public void impementareSttrategii() {

    }

    @Override
    public void conferintaPresa() {

    }
}
