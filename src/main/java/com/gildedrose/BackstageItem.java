package com.gildedrose;

class BackstageItem extends ImprovingItem {

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
