package com.gildedrose.items.improving;

public class AgedBrieItem extends ImprovingItem {

    private AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static AgedBrieItem of(String name, int sellIn, int quality) {
        return new AgedBrieItem(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        increaseQualityInBounds();

        if (sellIn < 0) {
            increaseQualityInBounds();
        }
    }

}
