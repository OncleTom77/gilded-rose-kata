package com.gildedrose;

class GildedRose {
    AbstractItemWrapper[] items;

    GildedRose(AbstractItemWrapper[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (AbstractItemWrapper item : items) {
            item.updateQuality();
        }
    }

}