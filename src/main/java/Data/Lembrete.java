package Data;

public class Lembrete {
    private String descricao;
    private Data data;

    public void ajustarLembrete(String descricao, Data data) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição do lembrete não pode ser nula");
        }
        if (data == null) {
            throw new IllegalArgumentException("A data do lembrete não pode ser nula");

        }
        this.descricao = descricao;
        this.data = data;

    }


    public Lembrete(String descricao, Data data) {
    ajustarLembrete(descricao, data);
    }
    public String imprimirLembrete(){
        return String.format("Lembrete: %s |Data: %s",descricao,data.mostrarData());
    }
}
