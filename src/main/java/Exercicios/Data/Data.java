package Exercicios.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //fazer um construtor;
    public Data(int d, int m, int a){
        ajustarData(d, m, a);
    }

    public void ajustarData(int d, int m, int a){
        if(!dataValida(d,m,a)) {
            throw new IllegalArgumentException("Data inválida: " + d + "/" + m + "/" + a);
        }
            this.dia = d;
            this.mes = m;
            this.ano = a;

    }



    private boolean dataValida(int d, int m, int a){
        if(a<=0) return false;
        if(m<1 || m>12) return false;
        int maxDia = diaMes(m,a);
        return d>=1 && d<=maxDia;
    }
    private int diaMes(int m, int a){
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2:
                return bissexto(a) ? 29:28;

            default: return 0;

        }
    }
    private boolean bissexto(int a){
        return(a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
    public String mostrarData(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
