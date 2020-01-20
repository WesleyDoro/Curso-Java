abstract class Animal {
}
class Dog extends Animal{

}
class Cat extends Animal{

}

class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal adicionado em " + nextIndex);
            nextIndex++;
        }
    }
}

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();

        list.add(d);
        list.add(c);
    }
}