package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import com.example.demo.validator.request.DiagnosisValidationRequest;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DiagnosisValidationFacade extends ValidationFacade<DiagnosisValidationRequest> {

    @Override
    ValidationResult validateInternal(ValidatorContext context, DiagnosisValidationRequest object) {
        System.out.println("Into Diagnosis Validation Facade");
        return new ValidationResult();
    }

    @Override
    ValidationType usingValidationType() {
        return ValidationType.DIAGNOSIS;
    }
}
