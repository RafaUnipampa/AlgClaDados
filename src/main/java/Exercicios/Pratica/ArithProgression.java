package Exercicios.Pratica;

/**
 * Escreva uma descrição da classe ArithProgression aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ArithProgression extends Progression{
    protected long inc;

    public ArithProgression(long inc){
        this.inc=inc;
    }

    public ArithProgression(){
        this(1);
    }

    @Override
    protected long nextValue(){
        return cur+=inc;
    }
}