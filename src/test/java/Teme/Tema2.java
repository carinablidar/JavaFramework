package Teme;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tema2 {

    @Test
    public void testTema() {

        reteteMancare();
    }

    public void reteteMancare() {
        Map<String, List<String>> retete = new HashMap<>();

        List<String> retetaLasagna = new ArrayList<>();
        retetaLasagna.add("Carne 500g");
        retetaLasagna.add("Rosii 500g");
        retetaLasagna.add("Pasta tomate 250g");
        retetaLasagna.add("Morcovi 20g");
        retetaLasagna.add("Ceapa 20g");
        retetaLasagna.add("Rosmarin");
        retetaLasagna.add("Sare");

        List<String> retetaTiramisu = new ArrayList<>();
        retetaTiramisu.add("Mascarpone 500ml");
        retetaTiramisu.add("Cafea 500ml");
        retetaTiramisu.add("Piscoturi 500g");
        retetaTiramisu.add("Zahar 200g");
        retetaTiramisu.add("Cacao 20g");

        retete.put("Lasagna", retetaLasagna);
        retete.put("Tiramisu", retetaTiramisu);

        for (String key: retete.keySet()) {
            System.out.println("Prima reteta este: " + key);
            System.out.println("Ingrdientele sunt: " + retete.get(key));
        }

    }

}
