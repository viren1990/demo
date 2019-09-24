package com.example.demo.validator;

import com.example.demo.validator.request.InsuranceValidationRequest;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class InsuranceValidator extends Validator<InsuranceValidationRequest> {


    @Override
    public ValidationResult validateInternal(ValidatorContext context, InsuranceValidationRequest object) {
        System.out.println("~~~~~~~~~ Into Insurance Validator ~~~~~~~~~~~");
        return null;
    }

    @Override
    public ValidationType usingValidationType() {
        return ValidationType.INSURANCE;
    }
}
