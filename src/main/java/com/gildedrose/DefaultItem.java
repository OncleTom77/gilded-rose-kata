package com.gildedrose;

class DefaultItem extends DegradableItem {

    DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        decreaseQualityInBounds();

        sellIn--;

        if (sellIn < 0) {
            decreaseQualityInBounds();
        }
    }
}
