package praktikum_2.enkapsulasi;

class BankAccount {
    private double saldo;
    
    public void setSaldo(double saldo) {
        if(saldo > 0) this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
}

public class enkapsulasi_latihan {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.setSaldo(1000000);
        System.out.println("Saldo saya : " + user.getSaldo());
    }
}
