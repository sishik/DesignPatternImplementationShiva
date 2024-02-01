package StructuralDesignPattern.Adaptor;
//middle men between phonepe and third party API
public interface BankAPIAdaptor {
    public String transfer(String toUserName, String fromUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenticate(String userName);
}
