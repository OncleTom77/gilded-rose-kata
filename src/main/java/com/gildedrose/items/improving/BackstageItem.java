package com.gildedrose.items.improving;

public class BackstageItem extends ImprovingItem {

    private BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static BackstageItem of(int sellIn, int quality) {
        return new BackstageItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
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
