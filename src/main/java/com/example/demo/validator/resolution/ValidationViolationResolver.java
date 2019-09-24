package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;

@FunctionalInterface
public interface ValidationViolationResolver {

    void resolveValidationViolation(ValidationResult validationResult);
}
