package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import com.example.demo.validator.request.InsuranceValidationRequest;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class InsuranceValidationFacade extends ValidationFacade<InsuranceValidationRequest> {

    @Override
    ValidationResult validateInternal(ValidatorContext context, InsuranceValidationRequest object) {
        System.out.println("Into insurance validation facade ");
        return new ValidationResult();
    }

    @Override
    ValidationType usingValidationType() {
        return ValidationType.INSURANCE;
    }
}
