package Games.SinkADotCom;

import java.util.List;

public class Ship {
    private String name;
    private List<String> locationGrid;

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocationGrid(List<String> lg) {
        this.locationGrid = lg;
    }

    public String checkIfHitOrMiss(String userHit) {
        String result = "Miss";

        int ind = locationGrid.indexOf(userHit);
        if (ind >= 0) {
            result = "Hit";
            locationGrid.remove(ind);
            if (locationGrid.isEmpty()) {
                result = "Kill";

            }
        }

        return result;
    }
}
