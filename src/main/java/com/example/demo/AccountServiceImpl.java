package com.example.demo;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountDto.ResAccount signUp(AccountDto.SignUpReq dto) {
        accountRepository.createAccount(dto);
        return new AccountDto.ResAccount(dto.toEntity());
    }

    @Override
    public AccountDto.ResAccount getAccount(String email) {
        return accountRepository.getAccount(
                AccountDto.loginAccount.builder()
                        .email(email)
                        .build());

    }

    @Override
    public List<AccountDto.ResAccount> getAccountList() {
        ModelMapper modelMapper = new ModelMapper();
        return accountRepository.getAccountList()
                .stream()
                .map(entity -> new AccountDto.ResAccount(entity))
                .collect(Collectors.toList());

    }
}
