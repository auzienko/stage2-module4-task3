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
        for (int i = 1; i <= matcher.groupCount(); i++) {
            nextParser.parse(abstractTextComponent, matcher.group(i));
        }
    }
}
