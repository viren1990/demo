package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;
import org.springframework.stereotype.Service;

@Service
public class InsuranceValidationViolationResolver implements ValidationViolationResolver {

    @Override
    public void resolveValidationViolation(ValidationResult validationResult) {
        System.out.println("Into Insurance Validation violation resolver");
    }
}
