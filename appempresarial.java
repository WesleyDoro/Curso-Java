class appempresarial {
    public static void main(String [] args){
        int beerNum = 99;
        String word = "Garrafas";

        while (beerNum > 0){
            if (beerNum == 1){
                word = "Garrafa";
            }

            System.out.println(beerNum + " " + word + " de bebidas.");
            System.out.println("Retirou uma.");
            System.out.println("Próxima Contagem.");
            beerNum = beerNum - 1;

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " de bebida no estoque.");
            } else {
                System.out.println("Sem garrafas de bebidas no estoque.");
            }
        }
    }
}