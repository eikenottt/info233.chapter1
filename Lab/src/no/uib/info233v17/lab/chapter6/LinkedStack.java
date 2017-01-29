package no.uib.info233v17.lab.chapter6;

import no.uib.info233v17.lab.chapter5.questions.q1and2.StackInterface;


/**
 * Created by Rune on 29.01.2017.
 */
public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode;

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
    }

    @Override
    public T pop() {

        T top = peek();

        if (topNode != null) {
            topNode = topNode.getNextNode();
        }

        return top;
    }

    @Override
    public T peek() {
        T top = null;

        if (topNode != null) {
            top = topNode.getData();
        }
        return top;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T newEntry, Node topNode) {
            setData(newEntry);
            setNextNode(topNode);
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNextNode() {
            return next;
        }

        public void setNextNode(Node next) {
            this.next = next;
        }
    }
}
