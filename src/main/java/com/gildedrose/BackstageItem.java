package com.gildedrose;

public class BackstageItem extends ItemWrapper {

    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        if (quality < 50) {
            quality++;
        }
        if (sellIn < 11 && sellIn > 5) {
            if (quality < 50) {
                quality++;
            }
        }
        if (sellIn < 6) {
            if (quality < 49) {
                quality += 2;
            } else if (quality < 50) {
                quality++;
            }
        }
        sellIn--;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
