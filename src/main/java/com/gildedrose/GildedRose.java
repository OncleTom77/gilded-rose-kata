package com.gildedrose;

class GildedRose {
    ItemWrapper[] items;

    public GildedRose(ItemWrapper[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].updateQuality();
        }
    }

}