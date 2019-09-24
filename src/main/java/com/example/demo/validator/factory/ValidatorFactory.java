package com.example.demo.validator.factory;

import com.example.demo.validator.ValidationType;
import com.example.demo.validator.Validator;

public interface ValidatorFactory {

    Validator getValidator(final ValidationType validationType);

}
