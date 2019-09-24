package com.example.demo.validator.resolution;

public enum ValidationViolationType {

    INSURANCE("insuranceValidationViolationResolver"), DIAGNOSIS("diagnosisValidationViolationResolver");

    private String code;

    private ValidationViolationType(String validationViolationResolver) {
        this.code = validationViolationResolver;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
