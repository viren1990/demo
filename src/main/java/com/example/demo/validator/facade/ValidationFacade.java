package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import com.example.demo.validator.request.AbstractValidationRequest;
import com.example.demo.validator.resolution.ValidationViolationType;
import com.example.demo.validator.resolution.factory.ValidationViolationResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ValidationFacade<T extends AbstractValidationRequest> {

    @Autowired
    private ValidationViolationResolverFactory validationViolationResolverFactory;

    abstract ValidationResult validateInternal(ValidatorContext context, T object);

    public ValidationResult validate(ValidatorContext context, T object) {
        final ValidationResult result = validateInternal(context, object);
        // find resolution codes
        validationViolationResolverFactory.getResolver(ValidationViolationType.valueOf(usingValidationType().name())).resolveValidationViolation(result);
        return result;
    }

    abstract ValidationType usingValidationType();
}
