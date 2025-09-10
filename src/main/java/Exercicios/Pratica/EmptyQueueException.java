package Exercicios.Pratica;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(){
        super("Fila Vazia");
    }

public EmptyQueueException(String name){
    super(name + " está vazia");

}


}