package com.gildedrose.items.degradable;

import com.gildedrose.items.AbstractItemWrapper;

abstract class DegradableItem extends AbstractItemWrapper {
    private static final int MINIMUM_QUALITY = 0;

    DegradableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void decreaseQualityInBounds() {
        if (quality > MINIMUM_QUALITY) {
            quality--;
        }
    }
}
