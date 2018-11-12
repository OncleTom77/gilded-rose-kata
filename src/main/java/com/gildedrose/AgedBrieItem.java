package com.gildedrose;

class AgedBrieItem extends ItemWrapper {

    AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        sellIn--;

        increaseQualityInBounds();

        if (sellIn < 0) {
            increaseQualityInBounds();
        }
    }

}
