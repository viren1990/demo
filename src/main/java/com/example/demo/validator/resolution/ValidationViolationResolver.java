package com.example.demo.validator.resolution;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidatorContext;

@FunctionalInterface
public interface ValidationViolationResolver {

    ValidationResult resolveValidationViolation(ValidatorContext validatorContext);
}
