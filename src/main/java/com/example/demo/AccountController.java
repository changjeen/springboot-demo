package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public AccountDto.ResAccount signUp(@RequestBody final AccountDto.SignUpReq dto) {
        return accountService.signUp(dto);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<AccountDto.ResAccount> getAccountList() {
        return accountService.getAccountList();
    }

    @RequestMapping(value = "/{email}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public AccountDto.ResAccount getAccount(@PathVariable final String email) {
        return accountService.getAccount(email);
    }
}
