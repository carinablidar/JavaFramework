package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, for each


    @Test
    public void metodaTest() {
       // afisamPrimeleNnr(5);
       // afisamPrimlenNrWhile(5);
        afisareNrPare();
    }

    //afisam primele 15 nr
    public void afisamPrimeleNnr(Integer capat) {
        for (Integer index = 0; index <= capat; index ++) {
            System.out.println(index);
        }
    }

    //aceasi metoda cu while
    public void afisamPrimlenNrWhile(Integer capat) {
        Integer index = 0;

        while (index <= capat) {
            System.out.println(index);
            index++;
        }
    }

    //afisare nr pare de la 0 - 20

    public void afisareNrPare() {
        for (Integer i = 0; i <= 20; i++ ){
            if(i%2==0){
            System.out.println(i);}
        }
    }
}
