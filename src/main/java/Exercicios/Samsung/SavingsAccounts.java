package Exercicios.Samsung;

public class SavingsAccounts {
    public static double annualInterestRate;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    private double savingBalance;

    public SavingsAccounts(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Não pode adotar valor negativo");
        }
        this.savingBalance = saldo;
    }


    public void calculateMonthlyInterest() {
        double juros = (savingBalance * annualInterestRate) / 12;
        savingBalance += juros;

    }

    public static void modifyMonthlyInterest(double novaTaxa) {
        if (novaTaxa < 0) {
            throw new IllegalArgumentException("Não pode ter taxa negativa!");
        }
        annualInterestRate = novaTaxa;

    }
}