package no.uib.info233v17.lab.chapter1.exercise2to4.interfaces;

/**
 * Created by Rune on 29.01.2017.
 */
public interface BagInterface<T> {

    int getCurrentSize();

    boolean isFull();

    boolean isEmpty();

    boolean add(T newEntry);

    T remove();

    boolean remove(T anEntry);

    void clear();

    int getFrequencyOf(T anEntry);

}
