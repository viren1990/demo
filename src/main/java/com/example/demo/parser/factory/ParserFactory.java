package com.example.demo.parser.factory;

import com.example.demo.parser.Parser;
import com.example.demo.parser.ParserType;

public interface ParserFactory {

    Parser getParser(final ParserType parserType);
}
