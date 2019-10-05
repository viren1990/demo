package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DiagnosisValidationViolationResolver implements ValidationViolationResolver {

    @Override
    public void resolveValidationViolation(ValidationResult validationResult) {
        System.out.println("Into Diagnosis validation violation resolver");
    }
}
