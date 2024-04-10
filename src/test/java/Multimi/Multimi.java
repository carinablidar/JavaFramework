package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {

    //multimi = array, lista, map

    @Test
    public void testM() {
        // colegiCursArray();
        // colegiCursLista();
        // diferiteGrupe();
        tariOrase();
    }


    //reprezentam multimea colegilor de la curs
    public void colegiCursArray () {
        String[] colegi = new String[4];
        colegi[0] = "Carina";
        colegi[1] = "Lavinia";
        colegi[2] = "Lucian";
        colegi[3] = "Alex";

        for (Integer index = 0; index < colegi.length; index++) {
            System.out.println(colegi[index]);
        }
    }

    //exemplu de mai sus cu liste
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Carina");
        colegi.add("Lavinia");
        colegi.add("Lucian");
        colegi.add("Alex");

        for (Integer index = 0; index < colegi.size(); index++) {
            System.out.println(colegi.get(index));
        }
    }

    //map => key (ar fi fruct) - value (ar fi mar)
    public void diferiteGrupe() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("fruct", "mar");
        obiecte.put("haina", "panatalon");
        obiecte.put("instrument", "chitara");

        for (String key: obiecte.keySet()) {
            System.out.println("cheia este: " + key);
            System.out.println("valoarea este " + obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orasele care le apartin
    public void tariOrase() {
        Map<String, List<String>> diverse = new HashMap<>();  //key = unica, valori = pot fi duplicate

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Timisoara");
        oraseRomania.add("Arad");
        oraseRomania.add("Cluj");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Tenerife");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        diverse.put("Romania", oraseRomania);
        diverse.put("Spania", oraseSpania);
        diverse.put("Italia", oraseItalia);

        for (String key: diverse.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasul este: " + diverse.get(key));
        }

        //tema = retete pt mancaruri in bucatarie (valori = ingrediente, mancarea = key)
    }





}
