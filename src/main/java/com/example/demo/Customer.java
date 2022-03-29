package com.example.demo;


import lombok.*;


@Builder
@AllArgsConstructor
@Getter
@ToString
public class Customer {
    private String email;
    @NonNull
    private String name;
}
