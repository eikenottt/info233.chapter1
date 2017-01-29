package no.uib.info233v17.lab.chapter5.questions.q1and2;

import java.util.ArrayList;

/**
 * Created by Rune on 29.01.2017.
 * @author Rune
 * @version 0.1
 */
public class OurStack<T> implements StackInterface<T> {


    private ArrayList<T> stack = new ArrayList<>();

    /**
     * Adds a new entry to the top of this stack.
     * @param newEntry an object to be added to the stack
     */
    @Override
    public void push(T newEntry){
        stack.add(newEntry);
    }

    /**
     * Removes and returns this stack's top entry.
     * @return either the object at the top of the stack or, if the
     *         stack is empty before the operation, null
     */
    @Override
    public T pop(){
        T topObject = stack.get(stack.size()-1);
        stack.remove(topObject);
        return topObject;
    }

    @Override
    public String toString() {
        return "OurStack{" +
                "stack=" + stack +
                '}';
    }

    /**
     * Retrieves this stack's top entry.
     * @return either the object at the top of the stack or null if the stack
     *         is empty
     */
    @Override
    public T peek(){
        return stack.get(stack.size()-1);
    }

    /**
     * Detects whether this stack is empty.
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }


    /**
     * Removes all entries from this stack
     */
    @Override
    public void clear(){
        stack.clear();
    }

    public static void main(String[] args) {
        StackInterface<String> stringStack = new OurStack<>();
        StackInterface<String> nameStack = new OurStack<>();
        stringStack.push("Jim");
        stringStack.push("Jess");
        stringStack.push("Jill");
        stringStack.push("Jane");

        int amount = stringStack.size();

        for (int i = 0; i < amount ; i++) {
            nameStack.push(stringStack.pop());
        }

        System.out.println(stringStack.toString());
        System.out.println(nameStack.toString());

    }

}
