class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}

class PoorDogTestDrive {
    public static void main (String[] args) {
        PoorDog one = new PoorDog();

        System.out.println("O tamanho de one é: " + one.getSize());
        System.out.println("O nome de one é: " + one.getName());
    }
}