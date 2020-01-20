class Duck {
    int size;
    public Duck(int DuckSize) {
        System.out.println("Quack!!");
        size = DuckSize;
        System.out.println("O Tamanho é igual a " + size);
    }
    public Duck() {
        System.out.println("Quack!!");
    }
}
public class UseADuck {
    public static void main (String[] args) {
        Duck d = new Duck();
    }
}