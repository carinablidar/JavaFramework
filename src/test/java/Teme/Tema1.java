package Teme;

import org.testng.annotations.Test;

public class Tema1 {

    // am tema sa afisez 4 masini diferite

    public String marca;
    public String model;
    public Integer an;
   public Boolean automata;
   public Float pret;
   public Integer caiPutere;


   public void prezentareMasina(String param1,
                                String param2,
                                Integer param3,
                                Boolean param4,
                                Float param5,
                                Integer param6) {
       System.out.println("Marca masinii este "+param1);
       System.out.println("Modelul masinii este "+param2);
       System.out.println("Anul fabricatiei "+param3);
       System.out.println("Este automata? "+param4);
       System.out.println("Pretul masinii este "+param5);
       System.out.println("Caii Putere: "+param6);
       System.out.println(" ");

   }
@Test
   public void metodaTest2() {
       prezentareMasina("BMW", "X5", 2020, true, 150f, 231);
       prezentareMasina("Audi", "A4", 2015, false, 140f, 110);
       prezentareMasina("Mercedes", "ML", 2021, true, 200f,113);
       prezentareMasina("Porsche", "Boxter", 2023, true, 230f,160);
   }


}
