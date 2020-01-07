import java.util.ArrayList;
import java.util.*;

class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
    }
}
class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(final ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourSelf(final String userInput) {
        String result = "Miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0 ) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
