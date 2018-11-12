package com.gildedrose.items;

import com.gildedrose.items.improving.AgedBrieItem;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AgedBrieItemTest {

    @Test
    public void should_increase_quality_and_decrease_sellIn_when_update_quality() {
        AbstractItemWrapper agedBrie = AgedBrieItem.of(2, 0);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(AgedBrieItem.of(1, 1));
    }

    @Test
    public void should_increase_quality_twice_and_decrease_sellIn_when_update_quality_and_sellIn_is_negative() {
        AbstractItemWrapper agedBrie = AgedBrieItem.of(0, 0);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(AgedBrieItem.of(-1, 2));
    }

    @Test
    public void should_not_increase_quality_but_decrease_sellIn_when_update_quality_and_quality_is_already_at_maximum() {
        AbstractItemWrapper agedBrie = AgedBrieItem.of(0, 50);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(AgedBrieItem.of(-1, 50));
    }
}
