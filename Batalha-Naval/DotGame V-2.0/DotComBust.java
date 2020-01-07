import java.io.* ;
import java.util.* ;
import java.util.jar.Attributes.Name;

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

        System.out.println("Seu objetivo é eliminar 3 DotComs.");
        System.out.println("Pets.com eToys.com e Go2.com");
        System.out.println("Tente eliminar toda com o menor numero de palpites.");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {//Iniciando o jogo
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Insira um palpite: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {//Checando o palpite do usuario
        numOfGuess++;

        String result = "Errado.";

        for (DotCom dotComToTest : dotComsList ) {
            result = dotComToTest.checkYourSelf(userGuess);

            if (result.equals("Correto.")) {
                break;
            }
            if (result.equals("Eliminar.")) {
                dotComsList.remove(dotComToTest);
               
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Todas a DotComs foram eliminadas! Agora seu conjunto está vazio.");
        if (numOfGuess <= 18) {
            System.out.println("Vocẽ só usou " + numOfGuess + " palpites.");
            System.out.println("Vocẽ saiu antes de eliminar suas opções.");
        } else {
            System.out.println("Demorou demais. " + numOfGuess + " palpites.");
            System.out.println("Não haverá pesca com essas opções.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();

        game.setUpGame();
        game.startPlaying();
    }
}
class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourSelf(String userInput) {
        String result = "Errado.";
        int index = locationCells.indexOf(userInput);

        if (index >= 0 ) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Eliminar.";
                System.out.println("Ora! Vocẽ afundou " + name + " :(");
            } else {
                result = "Correto.";
            }
        }
        return result;
    }
}

class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;
  
  
    public String getUserInput(String prompt) {
       String inputLine = null;
       System.out.print(prompt + "  ");
       try {
         BufferedReader is = new BufferedReader(
       new InputStreamReader(System.in));
         inputLine = is.readLine();
         if (inputLine.length() == 0 )  return null; 
       } catch (IOException e) {
         System.out.println("IOException: " + e);
       }
       return inputLine.toLowerCase();
    }
  
    
    
   public ArrayList<String> placeDotCom(int comSize) {                 // line 19
      ArrayList<String> alphaCells = new ArrayList<String>();
      String [] alphacoords = new String [comSize];      // holds 'f6' type coords
      String temp = null;                                // temporary String for concat
      int [] coords = new int[comSize];                  // current candidate coords
      int attempts = 0;                                  // current attempts counter
      boolean success = false;                           // flag = found a good location ?
      int location = 0;                                  // current starting location
      
      comCount++;                                        // nth dot com to place
      int incr = 1;                                      // set horizontal increment
      if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
        incr = gridLength;                               // set vertical increment
      }
  
      while ( !success & attempts++ < 200 ) {             // main search loop  (32)
      location = (int) (Math.random() * gridSize);      // get random starting point
          //System.out.print(" try " + location);
      int x = 0;                                        // nth position in dotcom to place
          success = true;                                 // assume success
          while (success && x < comSize) {                // look for adjacent unused spots
            if (grid[location] == 0) {                    // if not already used
               coords[x++] = location;                    // save location
               location += incr;                          // try 'next' adjacent
               if (location >= gridSize){                 // out of bounds - 'bottom'
                 success = false;                         // failure
               }
               if (x>0 & (location % gridLength == 0)) {  // out of bounds - right edge
                 success = false;                         // failure
               }
            } else {                                      // found already used location
                // System.out.print(" used " + location);  
                success = false;                          // failure
            }
          }
      }                                                   // end while
  
      int x = 0;                                          // turn good location into alpha coords
      int row = 0;
      int column = 0;
      // System.out.println("\n");
      while (x < comSize) {
        grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
        row = (int) (coords[x] / gridLength);             // get row value
        column = coords[x] % gridLength;                  // get numeric column value
        temp = String.valueOf(alphabet.charAt(column));   // convert to alpha
        
        alphaCells.add(temp.concat(Integer.toString(row)));
        x++;
  
        // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
        
      }
      // System.out.println("\n");
      
      return alphaCells;
     }
  }