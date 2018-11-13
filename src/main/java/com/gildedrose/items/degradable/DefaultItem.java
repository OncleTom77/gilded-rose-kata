package com.gildedrose.items.degradable;

public class DefaultItem extends DegradableItem {

    private DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static DefaultItem of(String name, int sellIn, int quality) {
        return new DefaultItem(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseQualityInBounds(1);

        sellIn--;

        if (sellIn < 0) {
            decreaseQualityInBounds(1);
        }
    }
}
