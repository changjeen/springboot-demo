package com.example.demo;

import java.util.List;

public interface AccountService {
    public AccountDto.ResAccount signUp(AccountDto.SignUpReq dto);
    public AccountDto.ResAccount getAccount(String email);
    public List<AccountDto.ResAccount> getAccountList();
}
