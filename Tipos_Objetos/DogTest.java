class Dog1{
    int size;
    String name;

    void bark() {
        if(size > 50){
            System.out.println(name + " diz Woof!!");
        }else if(size > 25){
            System.out.println(name + "  diz Ruf!!");
        }else{
            System.out.println(name + " diz Yip!!");
        }
    }
}
public class DogTest{

    public static void main(String[] args){
        Dog1 one = new Dog1();
        one.size = 70;
        one.name = "Bob";
        Dog1 two = new Dog1();
        two.size = 30;
        two.name = "Sasha";
        Dog1 three = new Dog1();
        three.size = 8;
        three.name = "Rex";

        one.bark();
        two.bark();
        three.bark();
    }
}