package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.mjc.stage2.entity.TextComponentType.SYMBOL;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = ".";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        Pattern pattern = Pattern.compile(LEXEME_REGEX);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            abstractTextComponent.add(new SymbolLeaf(SYMBOL, matcher.group().charAt(0)));
        }
    }

}
