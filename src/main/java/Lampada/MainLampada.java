package Lampada;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println("Estado Inicial: "+ lampada.mostrar());
        lampada.energizar();
        System.out.println("Depois de energizar "+ lampada.mostrar());
        lampada.desenergizar();
        System.out.println("Depois de tirar a energia: "+lampada.mostrar());
    }

        }
