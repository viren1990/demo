package com.example.demo.validator;

public enum ValidationType {

    INSURANCE("insuranceValidator"), DIAGNOSIS("diagnosisValidator"), PHYSICIAN("physicianValidator");

    private String code;

    private ValidationType(String validatorCode) {
        this.code = validatorCode;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
