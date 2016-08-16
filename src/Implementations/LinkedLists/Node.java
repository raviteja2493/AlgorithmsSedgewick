package Implementations.LinkedLists;

/**
 * Created by ravi on 8/15/16.
 */
public class Node<Item> {
    private Item item;
    private Node<Item> next;

    public Item getItem() {
        return item;
    }

    public Node<Item> getNext() {
        return next;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setNext(Node<Item> next) {
        this.next = next;
    }
}
