package com.example.demo.validator;

import java.util.stream.Stream;

public enum ValidationType {

    INSURANCE("insuranceValidationFacade", "insurance"),
    DIAGNOSIS("diagnosisValidationFacade", "diagnosis"),
    PHYSICIAN("physicianValidator", "physician");

    private String validationFacadeCode;

    private String validationTypeCode;

    private ValidationType(String validationFacadeCode, final String validationTypeCode) {
        this.validationFacadeCode = validationFacadeCode;
        this.validationTypeCode = validationTypeCode;
    }

    @Override
    public String toString() {
        return this.validationFacadeCode;
    }

    public static ValidationType fromString(final String validationTypeCode) {
        return Stream.of(values()).filter(validationType -> validationType.validationTypeCode.equalsIgnoreCase(validationTypeCode)).findFirst().orElseThrow(() ->
                new RuntimeException("bogus input"));
    }
}
