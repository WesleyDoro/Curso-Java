class Player {
    static int playerCount = 0;
    private String name;
    public Player(String n) {
        name = n;
        playerCount++;
    }
}
public class TestPlayer {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player p = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}