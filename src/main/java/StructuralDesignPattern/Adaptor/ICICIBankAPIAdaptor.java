package StructuralDesignPattern.Adaptor;

import StructuralDesignPattern.Adaptor.thirdpartyApi.ICICIBankAPI;
//
public class ICICIBankAPIAdaptor implements BankAPIAdaptor{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdaptor(ICICIBankAPI iciciBankAPI) {
        this.iciciBankAPI = iciciBankAPI;
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        long fromUserId = getUserIdFromUserName(fromUserName);
        long toUserId = getUserIdFromUserName(toUserName);
        return iciciBankAPI.doPayment(fromUserId, toUserId, amount);
    }

    @Override
    public double checkBalance(String userName) {
        long userId = getUserIdFromUserName(userName);
        return iciciBankAPI.balance(userId);
    }

    @Override
    public boolean authenticate(String userName) {
        long userId = getUserIdFromUserName(userName);
        return iciciBankAPI.checkUser(userId);
    }
    public long getUserIdFromUserName(String userName){
        return 0;
    }
}
