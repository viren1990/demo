package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DiagnosisValidationFacade extends ValidationFacade {

    @Override
    void validateInternal(ValidatorContext context) {

        // process request and update context with info fetched as part of request execution.

        System.out.println("Into Diagnosis Validation Facade");

    }

    @Override
    ValidationType usingValidationType() {
        return ValidationType.DIAGNOSIS;
    }
}
