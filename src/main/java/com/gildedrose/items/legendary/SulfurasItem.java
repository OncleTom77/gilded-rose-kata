package com.gildedrose.items.legendary;

import com.gildedrose.items.AbstractItemWrapper;

public class SulfurasItem extends AbstractItemWrapper {

    SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static SulfurasItem of(int sellIn, int quality) {
        return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }
}
