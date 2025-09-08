package Data;

public class MainAgenda {
    public static void main(String[] args) {
        Data d1 = new Data(7, 2, 2025);
        System.out.println("Data Válida: " + d1.mostrarData());
        Horario h1 = new Horario(9, 30);
        System.out.println("Horário Válido: "+h1.imprimirHorario());
        Lembrete l1 = new Lembrete("Pagar contas", new Data(20,9,2025));
        System.out.println(l1.imprimirLembrete());
        Compromisso c = new Compromisso(
                "Reunião do projeto",
                new Data(15,9,2025),
                new Horario(14,0)
        );
        System.out.println(c.imprimirCompromisso());

    }
}
