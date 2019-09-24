package com.example.demo.validator.resolution.factory;

import com.example.demo.validator.resolution.ValidationViolationResolver;
import com.example.demo.validator.resolution.ValidationViolationType;

@FunctionalInterface
public interface ValidationViolationResolverFactory {

    ValidationViolationResolver getResolver(final ValidationViolationType validationViolationType);
}
