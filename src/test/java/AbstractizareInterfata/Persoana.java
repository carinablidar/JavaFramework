package AbstractizareInterfata;

public class Persoana {

    //abstractizare = conceptul prin care definim comportamnetul inei clase
    //acest concept se poate face folosind interfete sau clase abstracte
    //o intersata se recunoaste dupa cuvantul "Interface"
    //o interfata contine doar metode abstracte(metode care nu au bady)
    //intr-o interfata toate metodele sunt publice
    //intr-o interfata putem avea metode de tip void sau return
    //intr-o interfata nu putem avea un constructor => nu putem face un obiect
    //o interfata se implementeaza, o clasa se mosteneste
    //clasa care implementeaza interfata => trebuie sa ofere implementare pt toate metodele abstracte
    //o clasa poate implementa n interfete
    //o interfata poate mosteni o alta interfata insa nu poate extinde o clasa abstracta


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta, Double rating, String nationalitate) {
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



}
