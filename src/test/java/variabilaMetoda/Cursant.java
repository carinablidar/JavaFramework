package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    // acesta e un comentariu
    // clasa = sablon specific unui anumit obiect/produs
    // o clasa trebuie sa contina un nume
    // recunoastem o clasa intr-un fisier java dupa cuvantul class
    // intr-un fisier java putem avea mai multe (nu este un practice bun)
    // variabila = proprietatea unei clasa
    // intr-o clasa putem ave mai multe variabile
    // exista 2 tipuri de variabile: global si local
    // variabila globala = vizibila peste tot in acest fisier
    // variabila locala = vizibila doar in locul unde este definita
    // pentru inceput toate var globale sunt publice
    // diferenta dintre global si local o face access control (public)
    // tipuri de date: String, Integer, Double (64 bit), Float (32 bit), Character, Boolean
    // nu este obligatoriu ca o var sa primeasca o valoare cand o definim

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    // metoda = actiunea unei clase
    // intr-o clasa putem avea mai multe metode, diferentiate prin nume
    // metodele sunt de 2 feluri: Void si Return
    // motoda Void = cea mai des folosita, care are ca scop sa execute si afiseze informatia
    // metoda Return = are ca scop sa execute si sa returneze
    // o metoda poate sau nu sa contina parametrii
    // parametrii se diferentiaza prin numar, nume sau tip

    @Test
    public void metodaTest() {
//        nume="Blidar";      //ctrl / = comentariu
//        prenume="Carina";
//        varsta=28;
//        inaltime=1.67;
//        greutate=50.5f;     // f = conversie in float
//        sex='F';
//        areRestante=false;

        prezentareCursant("Blidar", "Carina", 28, 1.67,50.5f, 'F', false);
        prezentareCursant("Chifor", "Horia", 28, 1.80,65.5f, 'M', true);
        calculMedie(8,9,10,5,7);

        System.out.println(getSalariu());
    }



    public void prezentareCursant(String param1,
                                  String param2,
                                  Integer param3,
                                  Double param4,
                                  Float param5,
                                  Character param6,
                                  Boolean param7) {

        System.out.println("Numele complet al curasantului este "+param1+" "+param2); // + = concatenare, " " = separator
        System.out.println("Varsta cursantului este "+param3);
        System.out.println("Inaltimea cursantului este "+param4);
        System.out.println("Greutatea cursantului este "+param5);
        System.out.println("Sexul cursantului este "+param6);
        System.out.println("Are cursantul restante? "+param7);
        System.out.println(" ");
        nume="Carina";


   }

   //calculam media cursantului din sesiune

    public void calculMedie(Integer nota1,
                            Integer nota2,
                            Integer nota3,
                            Integer nota4,
                            Integer nota5) {

        Integer medie=(nota1+nota2+nota3+nota4+nota5)/5;
        //sout = System.out.println
        System.out.println("Media cursanului este: "+medie);

    }

    //exemplu metoda return
    public Integer getSalariu() {
        Integer salar=2000;
        return salar;
    }


}
