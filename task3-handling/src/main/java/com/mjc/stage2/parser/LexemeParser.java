package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

import static com.mjc.stage2.entity.TextComponentType.SYMBOL;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] split = string.split(LEXEME_REGEX);
        for (String s : split) {
            abstractTextComponent.add(new SymbolLeaf(SYMBOL, s.charAt(0)));
        }
    }
}
