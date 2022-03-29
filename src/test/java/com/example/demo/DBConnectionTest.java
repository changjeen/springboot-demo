package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
public class DBConnectionTest {


    @Autowired
    AppProperties appProperties;

    @Test
    public void testConnection() throws Exception {
        Class.forName(appProperties.getDriver_class_name());
        try {
            System.out.println("Try to Connect " + appProperties.toString());
            Connection connection = DriverManager.getConnection(
                    appProperties.getUrl(),
                    appProperties.getUsername(),
                    appProperties.getPassword());
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
