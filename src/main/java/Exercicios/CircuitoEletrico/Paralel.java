package Exercicios.CircuitoEletrico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paralel extends Circuit {
    private final List<Circuit> ramos = new ArrayList<>();

    public Paralel() {
    }

    public Paralel(Circuit... ramos) {
        this.ramos.addAll(Arrays.asList(ramos));
    }

    public void add(Circuit c) {
        if (c == null) throw new IllegalArgumentException("Ramo nulo do circuito paralelo");
        ramos.add(c);
    }

    public List<Circuit> getRamos() {
        return ramos;
    }

    @Override
    public double getResistencia() {
        if(ramos.isEmpty()){
            throw new IllegalArgumentException("Circuito paralelo sem ramo");
        }
        double somaResistencia = 0.0;
        for(Circuit c : ramos){
            double r = c.getResistencia();
            somaResistencia += 1.0/r;
        }
        if(somaResistencia == 0){
            throw new ArithmeticException("Soma das Resistencias é zero");

        }
        return 1.0/somaResistencia;

    }
    @Override
    public String toString() {
        return "Parelo" + ramos;

    }
}
