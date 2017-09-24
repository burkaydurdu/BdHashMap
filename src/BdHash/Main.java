package BdHash;

import BdJson.BdJson;

public class Main {
    public static void main(String [] args) {
        BdHashMap<String, Object> d1 = new BdHashMap<>();
        d1.add("isim", "burkay");
        d1.add("soyisim", "durdu");
        d1.add("yas",22);

        BdHashMap<String, Object> d2 = new BdHashMap<>();
        d2.add("isim", "Ubeyde");
        d2.add("soyisim", "Ay");
        d2.add("yas",21);

        BdHashMap [] bdHashMaps = {d1, d2};
        BdJson json = new BdJson(bdHashMaps);
        System.out.println(json.toJson());
    }
}
