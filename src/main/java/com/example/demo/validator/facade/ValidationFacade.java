package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import com.example.demo.validator.resolution.ValidationViolationType;
import com.example.demo.validator.resolution.factory.ValidationViolationResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ValidationFacade {

    @Autowired
    private ValidationViolationResolverFactory validationViolationResolverFactory;

    abstract void validateInternal(ValidatorContext context);

    public ValidationResult validate(ValidatorContext context) {
        validateInternal(context);
        // find resolution codes
        return validationViolationResolverFactory.getResolver(ValidationViolationType.valueOf(usingValidationType().name())).resolveValidationViolation(context);
    }

    abstract ValidationType usingValidationType();
}
