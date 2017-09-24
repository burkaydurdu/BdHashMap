package BdJson;

import BdHash.BdHashMap;

public class BdJson {

    private BdHashMap [] bdHashMaps;
    public BdJson() {}
    public BdJson(BdHashMap [] bdHashMap) {
        this.bdHashMaps = bdHashMap;
    }

    public BdHashMap[] getBdHashMaps() {
        return bdHashMaps;
    }

    public void setBdHashMaps(BdHashMap[] bdHashMaps) {
        this.bdHashMaps = bdHashMaps;
    }

    public String toJson() {
        if(bdHashMaps == null) {
            return null;
        }
        StringBuilder stringJson = new StringBuilder("[");
        for(int i = 0; i<bdHashMaps.length; i++) {
            stringJson.append("{");
            for(int j = 0; j<bdHashMaps[i].length(); j++) {
                stringJson.append(bdHashMaps[i].index(j).getKey() + ":");
                stringJson.append(bdHashMaps[i].index(j).getValue());
                if(j + 1 != bdHashMaps[i].length())
                    stringJson.append(",");
            }
            stringJson.append("}");
        }
        stringJson.append("]");
        return stringJson.toString();
    }
}
