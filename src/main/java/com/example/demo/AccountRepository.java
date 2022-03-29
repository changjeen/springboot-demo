package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountRepository {
    public AccountDto.ResAccount getAccount(AccountDto.loginAccount dto);
    public void createAccount(AccountDto.SignUpReq dto);
    public List<Account> getAccountList();
}
