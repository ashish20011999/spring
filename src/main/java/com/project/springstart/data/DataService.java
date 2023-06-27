package com.project.springstart.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {
    public List<Integer> returnInteger()
    {
        return List.of(10,20,30,40);
    }
}