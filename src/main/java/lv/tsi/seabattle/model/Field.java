package lv.tsi.seabattle.model;

import java.util.HashMap;
import java.util.Map;

public class Field {
    private Map<String,CellContent> content = new HashMap<>();

    public void setShip(String addr) {
        content.put(addr,CellContent.EMPTY);
    }
    public CellContent getCell(String addr) {
        return content.getOrDefault(addr,CellContent.EMPTY);
    }
}
