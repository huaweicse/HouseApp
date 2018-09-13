package com.huawei.cse.houseapp.user.api;

public interface UserEndpoint {
    long login2(String userName, String password);
    
    long login(String userName, String password);

    boolean buyWithTransactionSaga(long userId, double price);
    
    boolean buyWithTransaction(long userId, double price);

    boolean buyWithTransaction2pc(long userId, double price);

    boolean buyWithoutTransaction(long userId, double price);

    double queryReduced();
    
    UserInfo getUserInfo(String userName);
}
