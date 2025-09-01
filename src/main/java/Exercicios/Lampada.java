package Exercicios;

public class Lampada {
    private boolean energizada;
    public void energizar(){
        energizada = true;

    }
    public void desenergizar(){
        energizada = false;
    }
    public boolean mostrar(){
        return energizada;
    }
}
//teste