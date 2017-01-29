package no.uib.info233v17.lab.chapter6;

import no.uib.info233v17.lab.chapter5.questions.q1and2.StackInterface;

import java.util.Arrays;

/**
 * Created by Rune on 29.01.2017.
 */
public class ArrayStack<T> implements StackInterface<T> {
    private T[] stack;
    private int topIndex;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
    }

    @Override
    public void push(T newEntry) {
        ensureCapacity();
        topIndex++;
        stack[topIndex] = newEntry;
    }

    private void ensureCapacity() {
        if (topIndex == stack.length - 1) {
            stack = Arrays.copyOf(stack, 2 * stack.length);
        }
    }

    @Override
    public T pop() {

        T top = null;

        if (!isEmpty()) {
            top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
        }

        return top;
    }

    @Override
    public T peek() {

        T top = null;

        if(!isEmpty()) {
            top = stack[topIndex];
        }

        return top;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void clear() {
        topIndex = -1;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }

    public static void main(String[] args) {
        StackInterface<String> array = new ArrayStack<>(4);

        array.push("Hei");
        System.out.println(array.toString());
        System.out.println(array.peek());
    }

}
