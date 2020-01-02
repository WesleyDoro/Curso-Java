class GoodDog{
    private int size; //Torna a Variavel de instancias privada

    public int getSize(){  //Torna os metodos de captura e configuração publicos
        return size;
    }

    public void setSize(int s){
        size = s;
    }                           

    void bark(){
        if(size > 60){
            System.out.println("Woof!!");
        }else if(size > 25){
            System.out.println("Ruf!!");
        }else{
            System.out.println("Yip!!");
        }
    }
}

class GoodDogTestDrive{
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        one.bark();
        System.out.println("Dog two: " + two.getSize());
        two.bark();
        
        
    }
}