package Implementations.LinkedLists;

/**
 * Created by ravi on 8/15/16.
 */
public class Stack<Item> {

    private Node<Item> first;
    private int N;

    void push(Item item){
        Node<Item> oldFirst = this.first;
        Node<Item> newFirst = new Node<Item>();
        newFirst.setItem(item);
        newFirst.setNext(oldFirst);
        this.first = newFirst;
        (this.N)++;
    }

    Item pop() throws  EmptyStackPopException{
        if(this.size() == 0){
            throw new EmptyStackPopException("cannot carry pop operation on empty stack");
        }else{
            Item item = this.first.getItem();
            this.first = this.first.getNext();
            this.N--;
            return item;
        }
    }

    int size(){
        return this.N;
    }

    boolean isEmpty(){
        return (this.first == null);
    }
}
