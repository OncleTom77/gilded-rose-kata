package com.gildedrose.items;

public class SulfurasItem extends AbstractItemWrapper {

    SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static SulfurasItem of(String name, int sellIn, int quality) {
        return new SulfurasItem(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }
}
