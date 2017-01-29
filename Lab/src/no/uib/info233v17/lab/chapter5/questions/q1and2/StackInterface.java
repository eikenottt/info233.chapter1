package no.uib.info233v17.lab.chapter5.questions.q1and2;

/**
 * Created by Rune on 29.01.2017.
 *
 * @author Rune
 * @version 0.1
 */
public interface StackInterface<T> {


    /**
     * Adds a new entry to the top of this stack.
     * @param newEntry an object to be added to the stack
     */
    void push(T newEntry);

    /**
     * Removes and returns this stack's top entry.
     * @return either the object at the top of the stack or, if the
     *         stack is empty before the operation, null
     */
    T pop();

    /**
     * Retrieves this stack's top entry.
     * @return either the object at the top of the stack or null if the stack
     *         is empty
     */
    T peek();

    /**
     * Detects whether this stack is empty.
     * @return true if the stack is empty
     */

    boolean isEmpty();


    /**
     * Removes all entries from this stack
     */
    void clear();


    int size();
} //end StackInterface