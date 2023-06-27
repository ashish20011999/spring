package com.project.springstart.service;

import com.project.springstart.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;
    public Optional<Integer> returnSum()
    {
        List<Integer> integers = dataService.returnInteger();
        return integers.stream().reduce(Integer::sum);
    }
}

