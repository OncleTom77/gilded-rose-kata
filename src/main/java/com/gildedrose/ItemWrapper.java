package com.gildedrose;

import java.util.Objects;

public class ItemWrapper extends Item {
    public ItemWrapper(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateQuality() {
        if (quality > 0) {
            quality--;
        }

        sellIn--;

        if (sellIn < 0 && quality > 0) {
            quality--;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return sellIn == item.sellIn &&
                quality == item.quality &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sellIn, quality);
    }

}
