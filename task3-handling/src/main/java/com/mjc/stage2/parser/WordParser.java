package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        Pattern pattern = Pattern.compile(WORD_REGEX);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            nextParser.parse(abstractTextComponent, matcher.group());
        }
    }
}
