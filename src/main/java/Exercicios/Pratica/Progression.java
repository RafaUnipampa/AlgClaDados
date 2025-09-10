package Exercicios.Pratica;

/**
 * Escreva uma descrição da classe Progression aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Progression
{
    protected long first;
    protected long cur;
    
    public Progression(){
    this.first = this.cur = 0;
    }
    protected long firstValue(){
    return cur = first;
    }
    
    protected long nextValue(){
        return ++cur;
    }
    
    public void printProgression(int n){
        System.out.print(firstValue());
        for (int i = 1;i < n; i++){
            System.out.print(" " + nextValue());

        }
        System.out.println();
    }

    
}
