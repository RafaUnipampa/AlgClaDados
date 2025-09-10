package Exercicios.Pratica;

public class FibonacciProgression extends Progression {
    protected long prev;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long v1, long v2) {
        first = v1;
        cur = v2;
        prev = v2 - v1;
    }

    @Override
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}
