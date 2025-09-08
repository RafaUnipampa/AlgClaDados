package Data;

public class Compromisso{
    private String descricao;
    private Data data;
    private Horario horario;



    public void ajustarCompromisso(String desc, Data data, Horario horario){
        if (desc == null || desc.isBlank()){
            throw new IllegalArgumentException("Descrição compromisso não pode ser nula \n");
        }
       if (data == null){
           throw new IllegalArgumentException("Data não pode ser nula");

       }
       if (horario == null){
           throw new IllegalArgumentException("Horário não pode ser nulo");
       }
       this.descricao = desc;
       this.data = data;
       this.horario = horario;
    }

    public Compromisso(String Descricao, Data data, Horario horario){
    ajustarCompromisso(Descricao,data,horario);
    }
    public String imprimirCompromisso(){
        return String.format("Compromisso: %s | Data: %s | Horario: %s", descricao,data.mostrarData(), horario.imprimirHorario());
    }
}
