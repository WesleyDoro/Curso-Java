class Movie{
    String titulo;
    String genero;
    int rating;

    void playIt(){
        System.out.println("Iniciando o Filme");
    }
}
class MovieTestDrive{
    public static void main(String [] args){
        Movie one = new Movie();
        one.titulo = "Gone with the Stock";
        one.genero = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.titulo = "Lost in Cubicle Space";
        two.genero = "Comedia";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.titulo = "Byte Club";
        three.genero = "Tragic";
        three.rating = 125;

    }
}