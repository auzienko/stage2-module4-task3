package com.mjc.stage2.entity;

import static com.mjc.stage2.entity.TextComponentType.SYMBOL;

public class SymbolLeaf extends AbstractTextComponent {

    private final char value;

    public SymbolLeaf(char value) {
        super(SYMBOL);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException();
    }
}
