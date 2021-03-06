package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidatorContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DiagnosisValidationViolationResolver implements ValidationViolationResolver {

    @Override
    public ValidationResult resolveValidationViolation(ValidatorContext validatorContext) {
        System.out.println("Into Diagnosis validation violation resolver");
        return null;
    }
}
