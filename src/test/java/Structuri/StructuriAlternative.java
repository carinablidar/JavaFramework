package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative = if..then..else/ switch..case


    @Test
    public void metodaTest() {

//        nunamrMaiMareCaX(11);
//        nunamrMaiMareCaX(3);
//        nunamrMaiMareCaX(10);

//        numarParPozitiv(0);
//        numarParPozitiv(1);
//        numarParPozitiv(2);
//        numarParPozitiv(-2);
//        numarParPozitiv(-1);

//        verificaPropozitie("Ana are mere", "Ana", "mere");
//        verificaPropozitie("Ana are mere", "Ana", "pere");
//        verificaPropozitie("Ana are mere", "ana", "pere");

        zileSaptamana(5);
    }

    //verificam daca un numar este mai mare deact 10

    public void nunamrMaiMareCaX(Integer input) {
        if (input>10) {
            System.out.println("Numaul "+input+" e mai mare deact 10");
        } else if (input == 10) {
            System.out.println("Numarul "+input+" este egal cu 10");
        } else {
            System.out.println("Numarul "+input+" nu este mai mare decat 10");
        }
    }

    //verificam daca un numar este par si pozitiv
    public void numarParPozitiv(Integer x) {
        if (x%2 == 0) {
            if (x>=0){
                System.out.println("Numarul " +x+ " par si pozitiv");
            }
            else {
                System.out.println("Numarul "+x+" par si negativ");
            }
        }
        else {
            if (x>=0){
                System.out.println("Numarul " +x+ " impar si pozitv");
            }
            else {
                System.out.println("Numarul " +x+ " impar si negativ");
            }
        }
    }

    //verificam ca o propozitie contine 2 cuvinte
    //Ana are mere -> caut Ana si mere
    public void verificaPropozitie(String propozitie, String cuvant1, String cuvant2) {
        if (!(propozitie.contains(cuvant1) && propozitie.contains(cuvant2))) {  // ! = neagtie
            System.out.println("Adevarat");
        }
        else {
            System.out.println("Fals");
        }
    }

    //reprezentam cazurile pt zilele saptamanii
    public void  zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi e luni");
                break;
            case 2:
                System.out.println("Azi e marti");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break;
            default:
                System.out.println("Nu exista optiunea selectata");
        }

    }
}
