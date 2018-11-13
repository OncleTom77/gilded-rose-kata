package com.gildedrose.items.legendary;

import com.gildedrose.items.AbstractItemWrapper;

abstract class LegendaryItem extends AbstractItemWrapper {

    private static final int LEGENDARY_ITEM_QUALITY = 80;

    LegendaryItem(String name, int sellIn) {
        super(name, sellIn, LEGENDARY_ITEM_QUALITY);
    }
}
