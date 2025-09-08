package Exercicios.Samsung;

public class MainSamsung {
    static void main() {
        SavingsAccounts sever1 = new SavingsAccounts(2000);
        SavingsAccounts sever2 = new SavingsAccounts(3000);

        SavingsAccounts.modifyMonthlyInterest(0.04);

        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();
        System.out.printf("Severe 1 com 4%%: %.2f%n ", sever1.getSavingBalance());
        System.out.printf("Severe 2 com 4%%: %.2f%n ",sever2.getSavingBalance());


        SavingsAccounts.modifyMonthlyInterest(0.05);

        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();

        System.out.printf("Server 1 com 5%%: %.2f%n ", sever1.getSavingBalance());
        System.out.printf("Server 2 com 5%%: %.2f%n ", sever2.getSavingBalance());




    }
}
