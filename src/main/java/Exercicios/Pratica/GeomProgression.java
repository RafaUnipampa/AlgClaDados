package Exercicios.Pratica;


public class GeomProgression extends Progression {
    protected long base;

    public GeomProgression() {
        this(2);
    }

    public GeomProgression(long base) {
        this.base = base;
        this.first = 1;
        this.cur = first;
    }

    @Override
    protected long nextValue() {
        cur *= base;
        return cur;
    }
}