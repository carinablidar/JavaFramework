package Euro2024.fotbalist.pozitii;

import Euro2024.fotbalist.Fotbalist;
import Euro2024.fotbalist.interfete.AtacantInterface;
import Euro2024.fotbalist.interfete.FundasInterface;

public class FundasOfensiv extends Fotbalist implements FundasInterface, AtacantInterface {
    public FundasOfensiv(String nume, String prenume, Integer varsta, Integer oras, Double rating, String nationalitate,
                         Integer pozitieTeren, Integer nrTricou, String club, String nationala,
                         Boolean esteCapitan, Boolean esteArbitru) {
        super(nume, prenume, varsta, oras, rating, nationalitate, pozitieTeren, nrTricou, club, nationala, esteCapitan, esteArbitru);
    }

    @Override
    public void evitaOffside() {

    }

    @Override
    public void executaPenalti() {

    }

    @Override
    public void simuleazaFault() {

    }

    @Override
    public void centreaza() {

    }

    @Override
    public void alearga() {

    }

    @Override
    public void dribleaza() {

    }

    @Override
    public void paseaza() {

    }

    @Override
    public void suteaza() {

    }

    @Override
    public void marcheaza() {

    }

    @Override
    public void recupereazaMingea() {

    }

    @Override
    public void faulteaza() {

    }

    @Override
    public void aparaCareul() {

    }

    @Override
    public void lovesteCuCapul() {

    }

    @Override
    public void paseazaLaPortar() {

    }
}