package Data;
import java.util.Scanner;
public class MainData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o dia: ");
            int d = sc.nextInt();
            System.out.println("Digite o mes: ");
            int m = sc.nextInt();
            System.out.println("Digite o ano: ");
            int a = sc.nextInt();

            Data data = new Data(d, m, a); // criei o objeto para testar
            System.out.println("Data criada com sucesso: " + data.mostrarData());

        }catch (IllegalArgumentException e){
            System.out.println("Erro ao tentar criar a Data: " + e.getMessage());

        }
        sc.close();
    }

}
