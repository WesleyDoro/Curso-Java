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
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();//Instancia um objeto SimpleDotCom

        int [] locations = {2,3,4};//Cria uma matriz int[] para o local das dot com(3 ints consecutivos dentre os 7 possiveis)

        dot.setLocationCells(locations);//chama o metodo de configuração na variavel dot com

        String userGuess = "2";//cria um palpite de usuario ficticio

        String result = dot.checkYourSelf(userGuess);//Chama o metodo checkYourSelf() no objeto dot com e passa para ele o palpíte ficticio

        String testResult = "Falha";
        if (result.equals("hit")) {
            testResult = "Passed";//Se o palpite ficticio(2) retornar um 'acerto' o codigo estara funcionando
        }

        System.out.println(testResult);//Exibe oresultado do teste(bem sucedido ou com falha)
    }
}