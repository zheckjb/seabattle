package lv.tsi.seabattle.model;

public class Player {
    private String name;
    private Field myField = new Field();
    private Field enemyField = new Field();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
