pubilc class Account{
    private String name;
    private double balance;
    private double withdraw;
    private int customerId;

    public Account (String name, double balance,double amount,int number){
        this.name = name;
        this .balance = balance;
        withdraw = amount;
        customerId = number;
    }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
                return name;
        }

    public void setBalance(double balance) {
        if(balance > 0.00)
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setWithdraw(double amount){
        if (withdraw > balance)
            withdraw = amount;
    }
    public double getWithdraw(){
        return withdraw;
    }
    public void setCustomerId(int number){
        customerId = number;
    }
    public int getCustomerId(){
        return customerId;
    }
}



