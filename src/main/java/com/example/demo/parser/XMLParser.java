package com.example.demo.parser;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope (scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class XMLParser implements  Parser {
    @Override
    public void parse(String str) {
        System.out.println("XML parser called for " + str);
    }
}
