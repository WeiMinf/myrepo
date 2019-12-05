package com.wmf.service;

import com.wmf.dao.IAccountdao;
import com.wmf.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountdao iaccountdao;

    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iaccountdao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存帐户...");
        iaccountdao.saveAccount(account);
    }
}
