package homework5.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Person objects
        Person bob_smith = new Person("Bob Smith");
        Person jerry_straus = new Person("Jerry Straus");
        Person mikey_has = new Person("Mikey Has");
        Person bob_smith1 = new Person("Bob Smith");

        //List of adresaSwimming
        List<Adresa> adresaSwimming = new ArrayList<>();
        adresaSwimming.add(new Adresa("Romania", "North"));
        adresaSwimming.add(new Adresa("Spain", "West"));
        adresaSwimming.add(new Adresa("Italy", "South"));


        //List of adresaCylcing
        List<Adresa> adresaCylcing = new ArrayList<>();
        adresaCylcing.add(new Adresa("Poland", "North"));
        adresaCylcing.add(new Adresa("Pakistan", "West"));
        adresaCylcing.add(new Adresa("Japan", "South"));


        //List of adresaSky
        List<Adresa> adresaSky = new ArrayList<>();
        adresaSky.add(new Adresa("Kingdom of Belgium", "North"));
        adresaSky.add(new Adresa("Denmark", "West"));
        adresaSky.add(new Adresa("Croatia", "South"));


        //List of adresaDancing
        List<Adresa> adresaDancing = new ArrayList<>();
        adresaDancing.add(new Adresa("India ", "South"));
        adresaDancing.add(new Adresa("France", "All"));
        adresaDancing.add(new Adresa("Colombia", "South"));


        //List of adresaFishing
        List<Adresa> adresaFishing = new ArrayList<>();
        adresaFishing.add(new Adresa("Germany ", "North"));
        adresaFishing.add(new Adresa("Belgium", "North-West"));
        adresaFishing.add(new Adresa("Netherlands", "All"));


        //Hobbies objects
        Hobbies swimming = new Hobbies("Swimming", 10, adresaSwimming);
        Hobbies cylcing = new Hobbies("Cycling", 25, adresaCylcing);
        Hobbies sky = new Hobbies("Sky", 5, adresaSky);
        Hobbies dancing = new Hobbies("Dancing", 100, adresaDancing);
        Hobbies fishing = new Hobbies("Fishing", 250, adresaFishing);

        //List of hobbies
        List<Hobbies> list1 = new ArrayList<>();
        list1.add(swimming);
        list1.add(cylcing);

        List<Hobbies> list2 = new ArrayList<>();
        list2.add(sky);
        list2.add(fishing);

        List<Hobbies> list3 = new ArrayList<>();
        list3.add(dancing);
        list3.add(fishing);
        list3.add(swimming);
        list3.add(sky);


        Map<Person, List<Hobbies>> hobbiesMap = new HashMap<>();

        hobbiesMap.put(bob_smith, list2);
        hobbiesMap.put(jerry_straus, list1);
        hobbiesMap.put(mikey_has, list1);
        hobbiesMap.put(bob_smith1, list2);
        hobbiesMap.put(bob_smith1, list3);
        streams(hobbiesMap);



    }
     private static void streams(Map<Person,List<Hobbies>> hobbiesMap ){
         for (Map.Entry<Person, List<Hobbies>> e : hobbiesMap.entrySet()) {
             System.out.println(e.getKey() + " "+e.getValue());
         }

     }

}
