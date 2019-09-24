package com.example.demo.validator;

import com.example.demo.validator.request.DiagnosisValidationRequest;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DiagnosisValidator extends Validator<DiagnosisValidationRequest> {

    @Override
    public ValidationResult validateInternal(ValidatorContext context, DiagnosisValidationRequest object) {
        System.out.println("~~~~~~~~~ Into Diagnosis Validator ~~~~~~~~~~~");
        return null;
    }

    @Override
    public ValidationType usingValidationType() {
        return ValidationType.DIAGNOSIS;
    }
}
