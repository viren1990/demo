package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisValidationViolationResolver implements ValidationViolationResolver {

    @Override
    public void resolveValidationViolation(ValidationResult validationResult) {
        System.out.println("Into Diagnosis validation violation resolver");
    }
}
