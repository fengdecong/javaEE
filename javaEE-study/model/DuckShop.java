package fengdecong.model;

import java.util.List;

public class DuckShop {
    private List<Duck> ducks;

    @Override
    public String toString() {
        return "DuckShop{" +
                "ducks=" + ducks +
                '}';
    }

    public void setDucks(List ducks) {
        this.ducks = ducks;
    }

    public List getDucks() {
        return ducks;
    }
}
