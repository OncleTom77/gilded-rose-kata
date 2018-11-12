package com.gildedrose;

class GildedRose {
    ItemWrapper[] items;

    public GildedRose(ItemWrapper[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof AgedBrieItem) {
                items[i].updateQuality();
                continue;
            }
            if (items[i] instanceof BackstageItem) {
                items[i].updateQuality();
                continue;
            }

            if (items[i].quality > 0) {
                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    items[i].quality = items[i].quality - 1;
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }

                }
            }
        }
    }
}