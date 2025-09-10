package Exercicios.Pratica;
public interface I_Fila<T> {
    void add(T obj);
    T remove() throws EmptyQueueException;
    boolean isEmpty();
}
