package com.project.springstart.web;

import com.project.springstart.data.DataService;
import com.project.springstart.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WebController {
    //types of dependency injection
    //1.Constructor based - this is the best and is recommended by spring, because we can autowire multiple beans in the same constructor
    //2.Setter based
    //3.Field based


//    @Autowired  //field based dependency injection
    private BusinessService businessService;

    private DataService dataService;

    @Autowired
    public WebController(BusinessService businessService, DataService dataService) {
        super();
        System.out.println("constructor based dependency injection");
        this.businessService = businessService;
        this.dataService = dataService;

    }
    @Autowired
    public void setBusinessService(BusinessService businessService) {
        System.out.println("setter based dependency injection");
        this.businessService = businessService;
    }

//    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("setter based dependency injection");
        this.dataService = dataService;
    }

    public Optional<Integer> returnSum() {
        return businessService.returnSum();
    }
}



