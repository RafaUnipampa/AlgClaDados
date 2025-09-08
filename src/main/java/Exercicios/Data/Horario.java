package Exercicios.Data;

public class Horario {
    private int hora;
    private int min;
    public Horario(int h, int min){
        ajustarHorario(h,min);
    }
    public void ajustarHorario(int h, int min){
        if(!horarioValido(h,min)){
            throw new IllegalArgumentException("Horário inválido: " + h +"h" + min + "min");
        }
        this.hora = h;
        this.min = min;
    }
    private boolean horarioValido(int h, int m){
        return (h>=0 && h <= 23) && (m>=0 && m <= 59);
    }
    public String imprimirHorario(){
        return String.format("%02dh%02dm", hora, min);
    }
}
