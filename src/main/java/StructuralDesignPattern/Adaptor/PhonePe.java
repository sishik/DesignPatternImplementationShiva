package StructuralDesignPattern.Adaptor;
/*so we have third party API ICICIBankAPI and YesBankAPI. so in phonepe if we directly
use the yesbank API then it will be tight coupling. as in future if yesbank server is down
or for some reason we want to move to other banks their will lot of change required.
so Always whnever you use third party API always use Adapter design [pattern.
so Adapter design patterrn is Structural design pattern.
so we create a interface to use the third party API and then we create a class which
implements the interface and then we create a class which implements the third party API

//so we have Here BankAPI interface which is used by PhonePe as Adaptor.

 */
public class PhonePe {
    private BankAPIAdaptor bankAPIAdaptor;

    public PhonePe() {
        this.bankAPIAdaptor = new YesBankAPIAdaptor();
    }
    public String transferMoney(String fromUserName, String toUserName, double amount){
        String result = bankAPIAdaptor.transfer(fromUserName,toUserName,1000);
        return result;
    }
    public double CheckBalance(String Username){
        return bankAPIAdaptor.checkBalance(Username);
    }
    public boolean authenticateUser(String Username){
        return bankAPIAdaptor.authenticate(Username);
    }
}
