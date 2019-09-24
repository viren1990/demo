package com.example.demo.parser;

public enum ParserType {
    JSON("jsonParser"), XML("xmlParser");

    private final String code;

    private ParserType(final String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
