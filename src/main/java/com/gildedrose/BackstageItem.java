package com.gildedrose;

class BackstageItem extends ItemWrapper {

    BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        quality++;

        if (sellIn < 11) {
            quality++;
        }
        if (sellIn < 6) {
            quality++;
        }
        if (quality > 50) {
            quality = 50;
        }

        sellIn--;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
