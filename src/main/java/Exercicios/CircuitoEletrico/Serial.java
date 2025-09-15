package Exercicios.CircuitoEletrico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Serial extends Circuit {
    private final List<Circuit> elementos = new ArrayList<>();

    public Serial() {
    }

    public Serial(Circuit... elementos) {
        this.elementos.addAll(Arrays.asList(elementos));

    }

    public void add(Circuit c) {
        if (c == null) {
            throw new IllegalArgumentException("Elemento NULO");
        }
        elementos.add(c);

    }

    public List<Circuit> getElementos() {
        return elementos;
    }

    @Override
    public double getResistencia() {
        if(elementos.isEmpty()) {
            throw new IllegalArgumentException("Circuitos em série nulo");
        }
        double soma = 0.0;
        for (Circuit c : elementos) {
            soma += c.getResistencia();
        }
        return soma;
    }
    @Override
    public String toString() {
        return "Série" + elementos;
    }
}