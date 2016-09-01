package Implementations.LinkedLists;

/**
 * Created by ravi on 8/16/16.
 */
public class Queue<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int N;


    public boolean isEmpty(){
        return (this.first == null);
    }

    public int size(){
        return this.N;
    }

    public void enqueue(Item item){
        Node<Item> oldLast = last;
        this.last = new Node<Item>();
        last.setItem(item);
        N++;
        if(isEmpty()){
            first = last;
        }else{
            oldLast.setNext(last);
        }
    }

    public Item dequeue() throws EmptyQueueDequeueException{
        if(this.size()==0){
            throw new EmptyQueueDequeueException("Can't dequeue from an empty queue");
        }else{
            Item itemPopped = this.first.getItem();
            first = first.getNext();
            N--;
            if(isEmpty()) last = null;
            return itemPopped;
        }
    }

}
