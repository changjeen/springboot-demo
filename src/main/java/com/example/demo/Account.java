package com.example.demo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String address1;
    private String address2;

    @Builder
    public Account(
            String email,
            String firstName,
            String lastName,
            String password,
            String address1,
            String address2) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address1 = address1;
        this.address2 = address2;
    }

    public void updateAccount(AccountDto.MyAccountReq dto) {
        this.address1 = dto.getAddress1();
        this.address2 = dto.getAddress2();
    }


}
