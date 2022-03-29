package com.example.demo;

import lombok.*;

public class AccountDto {
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SignUpReq {
        private String email;
        private String firstName;
        private String lastName;
        private String password;
        private String address1;
        private String address2;

        @Builder
        public SignUpReq(String email,
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

        public Account toEntity() {
            return Account.builder()
                    .email(this.email)
                    .firstName(this.firstName)
                    .lastName(this.lastName)
                    .password(this.password)
                    .address1(this.address1)
                    .address2(this.address2)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MyAccountReq{
        private String address1;
        private String address2;

        @Builder
        public MyAccountReq(String address1, String address2){
            this.address1 = address1;
            this.address2 = address2;
        }
    }

    @Getter
    public static class loginAccount{
        private String email;
        private String password;

        @Builder
        public loginAccount(String email) {
            this.email = email;
        }
    }


    @Getter
    @AllArgsConstructor
    public static class ResAccount{
        private String email;
        private String firstName;
        private String lastName;
        private String password;
        private String address1;
        private String address2;

        public ResAccount(Account account){
            this.email = account.getEmail();
            this.firstName = account.getFirstName();
            this.lastName = account.getLastName();
            this.password = account.getPassword();
            this.address1 = account.getAddress1();
            this.address2 = account.getAddress2();
        }
    }

}
