package Exercicios.Pratica;

public class TestMain {
    public static void main(String[] args) {
        Fila<Progression> fila = new Fila<>();

        fila.add(new ArithProgression());
        fila.add(new ArithProgression(5));
        fila.add(new GeomProgression());
        fila.add(new GeomProgression(5));
        fila.add(new FibonacciProgression());
        fila.add(new FibonacciProgression(4, 6));

        while (!fila.isEmpty()) {
            Progression p = fila.remove();
            System.out.print(p.getClass().getSimpleName() + " : ");
            p.printProgression(10);
        }
    }

}