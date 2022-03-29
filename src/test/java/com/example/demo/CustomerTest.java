package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CustomerTest {

    @DisplayName("@EqualsAndHashCode 테스트")
    @Test
    public void hashTest() {

        Customer customer = Customer.builder()
                .email("asdgamil.co")
                .name("test")
                .build();

        System.out.println(customer.toString());
    }
}


