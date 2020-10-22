package kurs_3_Task_18.playerUtil;

public class PlayerList {
    private Node start;

    public Node getStart() {
        return start;
    }

    public PlayerList(Player player) {
        this.start = new Node(player, null, null);
        start.next = start;
        start.prev = start;
    }

    public PlayerList() {
    }

    public void add(Player player) {
        Node nPlayer = new Node(player, start, start.prev);
        start.prev.next = nPlayer;
        start.prev = nPlayer;
    }

    public void remove() {
        start.prev = start.prev.prev;
        start.prev.prev.next = start;
    }

    private class Node {
        Player player;
        Node next;
        Node prev;

        public Node(Player player, Node next, Node prev) {
            this.player = player;
            this.next = next;
            this.prev = prev;
        }
    }
}
