package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class InsuranceValidationFacade extends ValidationFacade {

    @Override
    void validateInternal(ValidatorContext context) {
        System.out.println("Into insurance validation facade ");
    }

    @Override
    ValidationType usingValidationType() {
        return ValidationType.INSURANCE;
    }
}
