package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private final List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        if (parsers.isEmpty()) {
            throw new UnsupportedOperationException("Parser list is Empty");
        }
        for(int i = 1; i < parsers.size() - 1; ++i) {
            parsers.get(i - 1).setNextParser(parsers.get(i));
        }
        return parsers.get(0);
    }
}
