package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] kelime = {"emre","zeytin", "kilim", "kelam", "kelime"};
        List<String> tekrarliKelime = new ArrayList<>();
        analiz(kelime,tekrarliKelime);
        kelimeYazdir(tekrarliKelime);
    }
    public static ArrayList analiz(String[] kelime, List<String> tekrarliKelime){
        for (int i = 0; i < kelime.length; i++) { // dizideki kelimeleri geziyor
            for (int j = 0; j < kelime[i].length(); j++) { // kelimenin harflerini geziyoruz
                char[] parcala = kelime[i].toCharArray();
                for (int k = 0; k < kelime[i].length(); k++) {
                    if (parcala[j] == parcala[k] && j!=k){
                        if (tekrarliKelime.contains(kelime[i]) == false) {
                            tekrarliKelime.add(kelime[i]);
                        }
                    }
                }
            }
            if (tekrarliKelime.size() == 2) {
                return (ArrayList) tekrarliKelime;
            }
        }
        return null;
    }
    static void kelimeYazdir(List<String> tekrarliKelime){
        String harfler ="";
        for(String k : tekrarliKelime){harfler += k;} // birleştiriyoruz
        int harfSayisi = (harfler.length())-1;  // harfSayısını öğrenip subSequence içine yazacağımız indexler için harf sayısı bilgilerini alıyorum
        System.out.print(harfler.subSequence(harfSayisi/2,harfSayisi)); // burada rastgele harfleri almak için belirli bir aralık belirtiyorum. sabit vermemek için gelen harf sayısına göre işlem yaptırdım
    }
}