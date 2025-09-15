package Exercicios.CircuitoEletrico;

public class Resistor extends Circuit {
    private double resistencia; //ohms

    public Resistor(double resistencia) {
        if (resistencia < 0) {
            throw new IllegalArgumentException("Não existe resistência negativa");

        }
        this.resistencia = resistencia;
    }

    @Override
    public double getResistencia() {
        return resistencia;

    }

    @Override
    public String toString() {
        return String.format("R(%.2fΩ)", resistencia);
    }
}
