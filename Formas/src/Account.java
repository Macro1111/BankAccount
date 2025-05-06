public class Account {
    String userName;
    Double amount = 0.0;

    public Account(String userName){
        this.userName = userName;
    }

    public void deposit(Double amountIncrease){
        System.out.println(amountIncrease > 0 ? String.format("Dear %s, the new value in the account is $%.2f", userName,amount+=amountIncrease)
                : String.format("Dear %s, the entered amount is not valid. The value in your account is $%.2f", userName, amount));
    }

    public void withdraw(Double amountDecrease){
        System.out.println(amountDecrease > 0 && amount - amountDecrease >= 0 ? String.format("Dear %s, the new value in the account is $%.2f", userName,amount-=amountDecrease)
                : String.format("Dear %s, the entered amount is not valid. The value in your account is $%.2f", userName, amount));
    }
}
