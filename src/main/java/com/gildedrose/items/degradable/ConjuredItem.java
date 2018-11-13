package com.gildedrose.items.degradable;

import com.gildedrose.items.AbstractItemWrapper;

public class ConjuredItem extends DegradableItem {

    private ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static AbstractItemWrapper of(String name, int sellIn, int quality) {
        return new ConjuredItem(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseQualityInBounds(2);

        sellIn--;

        if (sellIn < 0) {
            decreaseQualityInBounds(2);
        }
    }
}
