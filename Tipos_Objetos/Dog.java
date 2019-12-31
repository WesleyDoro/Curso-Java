class Dog{
    String name;
    public static void main(String[] args){
        Dog dog1 = new Dog(); //Criando o Objeto dog1
        dog1.bark(); //Referenciando ao metodo bark()
        dog1.name = "Bart";

        //Agora cria uma Matriz dog
        Dog[] mydogs = new Dog[3];

        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        //Agora acessamos os objetos dogs usando as referencias de Matriz

        mydogs[0].name = "Fred";
        mydogs[1].name = "T-Rex";

        //Lembrando o nome do ultimo cão

        System.out.print("O nome do ultimo cão é ");
        System.out.println(mydogs[2].name);

        //Agora se executa um looping pela matriz onde todos os cães latem

        int x = 0;
        while(x < mydogs.length){
            mydogs[x].bark();
            x += 1;
        }
    }
    public void bark() {
        System.out.println(name + " diz Ruff!! Ruff!!");
    }
    public void eat() {

    }
    public void chaseCat() {

    }
}