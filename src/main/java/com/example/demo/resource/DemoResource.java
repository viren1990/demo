package com.example.demo.resource;

import com.example.demo.validator.ValidationType;
import com.example.demo.validator.Validator;
import com.example.demo.validator.factory.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

    @Autowired
    private ValidatorFactory validatorLocatorFactoryBean;

    @GetMapping("/")
    public String testResource(){
        final Validator validator =  validatorLocatorFactoryBean.getValidator(ValidationType.DIAGNOSIS);
        validator.validate(null , null);
        return "hello";
    }

}
