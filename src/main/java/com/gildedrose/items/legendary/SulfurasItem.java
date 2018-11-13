package com.gildedrose.items.legendary;

public class SulfurasItem extends LegendaryItem {

    private SulfurasItem(String name, int sellIn) {
        super(name, sellIn);
    }

    public static SulfurasItem of(int sellIn) {
        return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn);
    }

    @Override
    public void updateQuality() {

    }
}
