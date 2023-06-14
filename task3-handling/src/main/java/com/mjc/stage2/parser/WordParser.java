package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] split = string.split(WORD_REGEX);
        for (String s : split) {
            nextParser.parse(abstractTextComponent, s);
        }
    }
}
