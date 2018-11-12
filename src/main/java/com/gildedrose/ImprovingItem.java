package com.gildedrose;

abstract class ImprovingItem extends AbstractItemWrapper {
    private static final int MAXIMUM_QUALITY = 50;

    ImprovingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void increaseQualityInBounds() {
        if (quality < MAXIMUM_QUALITY) {
            quality++;
        }
    }
}
