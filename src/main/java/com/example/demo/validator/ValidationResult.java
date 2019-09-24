package com.example.demo.validator;

import java.util.List;

public class ValidationResult {

    private List<ValidationError> errors = List.of();

    private List<ValidationViolationResolutionResponse> violationResolutions =List.of();

    public static class ValidationError{

        private String field;

        private String message;


    }

    public boolean hasErrors(){
        return errors.isEmpty();
    }

    public boolean addError(final ValidationError error){
        return errors.add(error);
    }

    public boolean addResolution(final ValidationViolationResolutionResponse resolution){
        return violationResolutions.add(resolution);
    }
}
