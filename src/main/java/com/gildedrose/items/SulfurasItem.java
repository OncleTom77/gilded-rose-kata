package com.gildedrose.items;

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
