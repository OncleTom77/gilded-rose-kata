package com.gildedrose;

import java.util.Objects;

public class ItemWrapper extends Item {

    private static final int MAXIMUM_QUALITY = 50;
    private static final int MINIMUM_QUALITY = 0;

    public ItemWrapper(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateQuality() {
        decreaseQualityInBounds();

        sellIn--;

        if (sellIn < 0) {
            decreaseQualityInBounds();
        }
    }

    private void decreaseQualityInBounds() {
        if (quality > MINIMUM_QUALITY) {
            quality--;
        }
    }

    void increaseQualityInBounds() {
        if (quality < MAXIMUM_QUALITY) {
            quality++;
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
