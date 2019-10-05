package com.example.demo.validator.facade;

import com.example.demo.validator.ValidationType;

public interface ValidationFacadeFactory {

    ValidationFacade getValidationFacade(final ValidationType validationType);
}
