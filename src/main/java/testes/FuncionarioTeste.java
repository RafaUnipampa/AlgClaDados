package testes;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gohan";
        funcionario.idade = 32;
        funcionario.salario = new float[]{3504.34F,2594.23f, 3000.09f};

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "RafaeL";
        funcionario2.idade = 29;
        funcionario2.salario = new float[] {2430.29f, 2533.43f, 2642.64f};

        Funcionario funcionario3 = new Funcionario();
        funcionario3.nome = "Korea";
        funcionario3.idade = 24;
//        funcionario3.salario = new float[] {1630.49f, 2749,54f, 2984.3f};



        funcionario.imprimir();
        funcionario.mediaSalarios();
        funcionario2.imprimir();
        funcionario2.mediaSalarios();
        funcionario3.imprimir();
        funcionario3.mediaSalarios();


    }

}
