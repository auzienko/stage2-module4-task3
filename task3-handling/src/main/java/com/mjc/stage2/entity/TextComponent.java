package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

import static com.mjc.stage2.entity.TextComponentType.WORD;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();

    public TextComponent() {
        super(WORD);
    }

    @Override
    public String operation() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var component : componentList) {
            stringBuilder.append(component.operation());
        }
        return stringBuilder.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.size();
    }
}
