package Exercicios.Pratica;



public class Fila<T> extends List<T> implements I_Fila<T> {

    public Fila() {
        super("Fila");
    }

    @Override
    public void add(T obj) {
        insertAtBack(obj);
    }

    @Override
    public T remove() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Fila");
        }
        return removeFromFront();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}