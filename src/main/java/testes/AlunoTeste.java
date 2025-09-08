package testes;

public class AlunoTeste {
    public static void main(String[] args) {
        Local local = new Local("Universidade Federal do Pampa");
        Professor professor = new Professor("Leonardo Pinho", "Arquitetura e Organização de Computadores");
        Aluno aluno = new Aluno("Rafael Vieira Gonçalves", 29);
        Aluno[] alunosSemniario = {aluno};
        Seminario seminarios = new Seminario("Drones abatedores de pernilongos", alunosSemniario, local);
        Seminario[] seminarioDisponivel = {seminarios};
        professor.setSeminarios(seminarioDisponivel);
        professor.imprimir();



        ;
    }
}
