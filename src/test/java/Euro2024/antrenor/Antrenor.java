package Euro2024.antrenor;

import AbstractizareInterfata.Persoana;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Antrenor extends Persoana implements AntrenorInterfata {


    private Integer aniExperienta;
    private String echipaNationala;
    private Integer nrTrofee;


    public Antrenor(String nume, String prenume, Integer varsta, Double rating, String nationalitate, Integer aniExperienta,
                    String echipaNationala, Integer nrTrofee) {
        super(nume, prenume, varsta, rating, nationalitate);
        this.aniExperienta = aniExperienta;
        this.echipaNationala = echipaNationala;
        this.nrTrofee = nrTrofee;
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
