package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<User> getAllUserList() {
        return testMapper.getAllUserList();
    }
}
