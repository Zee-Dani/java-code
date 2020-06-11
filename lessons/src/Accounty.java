public class Accounty {
    private String name;
    private double balance;

    // a constructor initialized for String name
    public Accounty(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }
}


