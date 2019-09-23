class Dog{
    int tamanho;        //
    String raca;        //Variaveis de Instancia 
    String nome;        //

    void bark(){        //Um método
        System.out.println("Ruff! Ruff!");
    }
}
class DogTestDrive{
    public static void main(String[] args){         //Apenas um método main
       Dog d = new Dog();      //Criando um Objeto
       
       d.tamanho = 40;      //Utilizando o operador . para definir o tamanho do objeto dog

       d.bark();    //Chamando o metodo bark
    }
}