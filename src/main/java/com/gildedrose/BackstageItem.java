package com.gildedrose;

class BackstageItem extends ItemWrapper {

    BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        increaseQualityInBounds();

        if (sellIn < 11) {
            increaseQualityInBounds();
        }
        if (sellIn < 6) {
            increaseQualityInBounds();
        }

        sellIn--;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
