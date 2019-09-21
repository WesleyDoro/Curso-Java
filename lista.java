public class lista{
    public static void main(String [] args){
        //Criando um lista
        String[] listaum = {"wesley", "patrick", "pereira", "doro"};
        String[] listadois = {"sandrilene", "das", "graças", "pereira"};
        String[] listatres = {"valdir", "doro", "junior"};

        //Descubra quantas palavras existe em uma lista 
        int oneLength = listaum.length;
        int twoLenght = listadois.length;
        int threeLenght = listatres.length;

        //Geranndo tres numeros aleatorios

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        //Construindo uma frase

        String frase = listaum[rand1] + " " + listadois[rand2] + " " + listatres[rand3];

        //Famoso Print

        System.out.println("O nome é " + frase);
    }
}