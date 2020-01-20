class Animal {
    public Animal() {
        System.out.println("Criando um objeto animal...");
    }
}

class Hippo extends Animal {
    public Hippo() {
        System.out.println("Criando um objeto Hippo...");
    }
}

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Hippo h = new Hippo();
        System.out.println("Objetos criados e programa inicializado.");
    }
}
