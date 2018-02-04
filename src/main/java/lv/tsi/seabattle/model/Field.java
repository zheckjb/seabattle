package lv.tsi.seabattle.model;

import java.util.HashMap;
import java.util.Map;

public class Field {
    private Map<String,CellContent> content = new HashMap<>();
    private boolean invalid;

    public void setShip(String addr) {
        content.put(addr,CellContent.EMPTY);
    }
    public boolean hasShip(String addr) {
        return content.get(addr) == CellContent.SHIP;
    }
    public CellContent getCell(String addr) {
        return content.getOrDefault(addr,CellContent.EMPTY);
    }

    public void clear() {
        content.clear();
    }
    public void validate() {
        this.invalid = content.size() != 20;
    }

    public boolean isInvalid() {
        //Why not 'content.size() != 20;' ?
        return invalid;
    }
}
