package StructuralDesignPattern.Adaptor;

import StructuralDesignPattern.Adaptor.thirdpartyApi.YesBankAPI;

public class YesBankAPIAdaptor implements BankAPIAdaptor {
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdaptor(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        return yesBankAPI.transfer(toUserName, fromUserName, amount);
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenticate(String userName) {
        return yesBankAPI.authenticate(userName);
    }
}
