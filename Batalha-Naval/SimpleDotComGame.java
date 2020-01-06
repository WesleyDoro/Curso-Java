import java.io.*;
class GameHelper{
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader (System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0 ) return null;
        } catch(IOException e) {
            System.out.println("IOExeption: " + e);
        }
        return inputLine;
    }
}

class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Insira um Numero: ");
            String result = theDotCom.checkYourSelf(guess);

            numOfGuess++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("Você usou " + numOfGuess + "palpites");
            }
        }
    }
}
class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result  = "miss";

        for (int cell : locationCells) {
            if( guess == cell) {
                result = "hit";

                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }
}
