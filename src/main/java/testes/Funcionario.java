package testes;

public class Funcionario {
    String nome = null;
    int idade = 0;
    float salario[] = null;

    public void imprimir(){
        if(salario == null){
            System.out.println("O Salário de " + nome + " não está compatível");
            return;
        }
        System.out.println(this.nome);
        System.out.println("Idade: " + idade);
        for (float salario : salario) {
            System.out.println(salario + "");
        }
        System.out.println();

    }
    public void mediaSalarios(){
        if (salario == null) {
            return;
        }
        float media=0;
        for(float salario : salario) {
            media += salario;
        }
        media /= salario.length;
        System.out.println("Média salarial do  "+nome+" é R$"+ media);
        System.out.println();



        }
    }
