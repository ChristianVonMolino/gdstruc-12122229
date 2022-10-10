public class PlayerNode extends Main {
    private Player player;
    private PlayerNode nextPlayer;

    public PlayerNode(Player player, PlayerNode nextPlayer) {
        this.player = player;
        this.nextPlayer = nextPlayer;
    }

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer(PlayerNode head) {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}