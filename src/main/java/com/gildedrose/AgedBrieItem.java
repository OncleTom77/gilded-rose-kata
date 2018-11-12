package com.gildedrose;

public class AgedBrieItem extends ItemWrapper {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        sellIn--;
        if (quality < 50) {
            quality++;
        }

        if (sellIn < 0
            && quality < 50) {
            quality++;
        }
    }
}
